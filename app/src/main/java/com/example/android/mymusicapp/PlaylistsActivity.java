package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        //Capture the Button from Playlists Activity layout
        Button playPlaylist = (Button) findViewById(R.id.button_play_playlist);
        //Assign a ClickListener and action for that Button
        playPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playThisPlaylist = new Intent(v.getContext(),PlayActivity.class);
                startActivity(playThisPlaylist);
            }
        });
    }
}
