package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Capture our Button from Search Activity layout
        Button playSongs = (Button) findViewById(R.id.button_play_songs);
        //Assign a ClickListener and action for that Button
        playSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playThat = new Intent(v.getContext(),PlayActivity.class);
                startActivity(playThat);
            }
        });
    }
}
