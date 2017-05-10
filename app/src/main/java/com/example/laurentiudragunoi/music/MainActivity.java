package com.example.laurentiudragunoi.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the CardView that shows the Library Activity.
        CardView library = (CardView) findViewById(R.id.library);

        //Set a click listener on the view if the library is not null.
        if (library != null) {
            library.setOnClickListener(new View.OnClickListener(){
                //The cod will be executed when the library card will be clicked on.
                @Override
                public void onClick(View view) {
                    Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                    //Start the new activity- Library.
                    startActivity(libraryIntent);
                }

            });
        }

        // Find the CardView that shows the Artists Activity.
        CardView artists = (CardView) findViewById(R.id.artists);

        //Set a click listener on the view if the artists is not null.
        if (artists != null) {
            artists.setOnClickListener(new View.OnClickListener(){
                //The cod will be executed when the artists card will be clicked on.
                @Override
                public void onClick(View view) {
                    Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                    //Start the new activity- Artists.
                    startActivity(artistsIntent);
                }

            });
        }
        // Find the CardView that shows the Now Playing Activity.
        CardView nowPlaying = (CardView) findViewById(R.id.now_playing);

        //Set a click listener on the view if the nowPlaying is not null.
        if (nowPlaying != null) {
            nowPlaying.setOnClickListener(new View.OnClickListener(){
                //The cod will be executed when the now_playing card will be clicked on.
                @Override
                public void onClick(View view) {
                    Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                    //Start the new activity- Now Playing.
                    startActivity(nowPlayingIntent);
                }

            });
        }
        // Find the CardView that shows the Playlist Activity.
        CardView playlist = (CardView) findViewById(R.id.playlist);

        //Set a click listener on the view if the playlist is not null.
        if (playlist != null) {
            playlist.setOnClickListener(new View.OnClickListener(){
                //The cod will be executed when the playlist card will be clicked on.
                @Override
                public void onClick(View view) {
                    Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                    //Start the new activity- Playlist.
                    startActivity(playlistIntent);
                }

            });
        }
        // Find the  FloatingButton that shows the Search Activity.
        FloatingActionButton search = (FloatingActionButton) findViewById(R.id.search);

        //Set a click listener on the button if the search is not null.
        if (search != null) {
            search.setOnClickListener(new View.OnClickListener(){
                //The cod will be executed when the search button will be clicked on.
                @Override
                public void onClick(View view) {
                    Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                    //Start the new activity- Search.
                    startActivity(searchIntent);
                }

            });
        }
    }
}
