package com.example.laurentiudragunoi.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

    }

    //Inflating the menu bar on the Search ACtivity page
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //Creating Intents for each menu item.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_home:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_library:
                intent = new Intent(this, LibraryActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_artists:
                intent = new Intent(this, ArtistsActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_now_playing:
                intent = new Intent(this, NowPlayingActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_playlist:
                intent = new Intent(this, PlaylistActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}


