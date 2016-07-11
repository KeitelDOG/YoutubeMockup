package com.megalobiz.youtubemockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by KeitelRobespierre on 7/11/2016.
 */
public abstract class AppCompatUploadActivity extends AppCompatActivity {

    private MotionOperation motion;

    public AppCompatUploadActivity(){
        this.motion = new MotionOperation();
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //parse the Motion event
        motion.parseMotion(event);

        if (motion.isCloseLeftToRight()) {
            onSideMenu(new View(AppCompatUploadActivity.this));
        }
        return super.onTouchEvent(event);
    }

    public void onSideMenu(View v){
        Intent i = new Intent(this, SideMenuActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

    public void onSearch(View v){
        Intent i = new Intent(this, SearchBlankActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

    public void onHome(View v){
        Intent i = new Intent(this, UploadHomeActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

    public void onVideos(View v){
        Intent i = new Intent(this, UploadVideosActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

    public void onPlaylists(View v){
        Intent i = new Intent(this, UploadPlaylistsActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

    public void onChannels(View v){
        Intent i = new Intent(this, UploadChannelsActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

    public void onAbout(View v){
        Intent i = new Intent(this, UploadAboutActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }
}
