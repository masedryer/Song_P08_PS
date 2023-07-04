package sg.edu.rp.c346.id22020860.song;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class songDisplay extends AppCompatActivity {
    ListView lv;
    ArrayList<Song> alSong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_display);


        alSong = new ArrayList<Song>();

        lv = findViewById(R.id.lv);


        ArrayAdapter adapter = new ArrayAdapter<>(songDisplay.this, android.R.layout.simple_list_item_1, alSong);


        lv.setAdapter(adapter);

        DBHelper db = new DBHelper(songDisplay.this);
        alSong.clear();
        alSong.addAll(db.getSong());
        adapter.notifyDataSetChanged();


        ArrayList<String> data = db.getSongContent();





    }




}