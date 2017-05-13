package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Capture our elements from Home(Main Activity) layout
        TextView myPlaylistsCategory = (TextView) findViewById(R.id.text_playlists);
        TextView searchCategory = (TextView) findViewById(R.id.text_search);
        TextView mySongsCategory = (TextView) findViewById(R.id.text_my_songs);
        TextView buyMusicCategory = (TextView) findViewById(R.id.text_buy_music);
        ImageView playCategory = (ImageView) findViewById(R.id.image_play_now);

        //Assign a ClickListener and action for each element defined before
        myPlaylistsCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Playlists = new Intent(v.getContext(),PlaylistsActivity.class);
                startActivity(Playlists);
            }
        });
        searchCategory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent Search = new Intent(v.getContext(),SearchActivity.class);
                startActivity(Search);
            }
        });
        mySongsCategory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent Songs = new Intent(v.getContext(),SongsActivity.class);
                startActivity(Songs);
            }
        });
        buyMusicCategory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent Buy = new Intent(v.getContext(),BuyActivity.class);
                startActivity(Buy);
            }
        });
        playCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Play = new Intent(v.getContext(),PlayActivity.class);
                startActivity(Play);
            }
        });
    }
}
