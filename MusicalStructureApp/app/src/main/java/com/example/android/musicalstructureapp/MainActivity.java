package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Zauber Flöte", "Mozart"));
        songs.add(new Song("Four season", "Beethowen"));
        songs.add(new Song("Mer Hahn en neue Oberkeet", "Bach"));
        SongAdapter adapter = new SongAdapter(this, songs);
        final Intent changeIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
        final ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Button startButton=(Button)findViewById(R.id.play_button);
                startButton.setVisibility(View.VISIBLE);
                Song music = (Song) listView.getItemAtPosition(i);
                changeIntent.putExtra("tittle", music.getSongName());
                changeIntent.putExtra("artist", music.getArtistName());
                startButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(changeIntent);
                    }
                });

            }
        });

    }
}
