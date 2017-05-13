package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //Capture our Button from Search Activity layout
        Button playSearch = (Button) findViewById(R.id.button_play_search);
        //Assign a ClickListener and action for that Button
        playSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playThisSearch = new Intent(v.getContext(),PlayActivity.class);
                startActivity(playThisSearch);
            }
        });
    }
}
