package com.example.laurentiudragunoi.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);


        // Find the  FloatingButton that shows the Search Activity.
        FloatingActionButton search = (FloatingActionButton) findViewById(R.id.search);
        //Set a click listener on the button if the search is not null.
        if (search != null) {
            search.setOnClickListener(new View.OnClickListener(){
                //The cod will be executed when the search button will be clicked on.
                @Override
                public void onClick(View view) {
                    Intent searchIntent = new Intent(ArtistActivity.this, SearchActivity.class);
                    //Start the new activity- Search.
                    startActivity(searchIntent);
                }

            });
        }

    }
}
