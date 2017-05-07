package com.example.laurentiudragunoi.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        // Find the  CardView that shows the Artist Activity.
        CardView artist = (CardView) findViewById(R.id.artist_card);

        //Set a click listener on the cardView if the artist is not null.
        if (artist != null) {
            artist.setOnClickListener(new View.OnClickListener(){
                //The cod will be executed when the search button will be clicked on.
                @Override
                public void onClick(View view) {
                    Intent artistIntent = new Intent(ArtistsActivity.this, ArtistActivity.class);
                    //Start the new activity- ArtistActivity.
                    startActivity(artistIntent);
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
                    Intent searchIntent = new Intent(ArtistsActivity.this, SearchActivity.class);
                    //Start the new activity- Search.
                    startActivity(searchIntent);
                }

            });
        }


    }
}
