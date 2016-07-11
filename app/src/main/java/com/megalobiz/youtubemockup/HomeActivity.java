package com.megalobiz.youtubemockup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    private MotionOperation motion;

    public HomeActivity(){
        this.motion = new MotionOperation();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //parse the Motion event
        motion.parseMotion(event);

        if (motion.isCloseLeftToRight()) {
            onSideMenu(new View(HomeActivity.this));
        }
        return super.onTouchEvent(event);
    }

    public void onMusic(View v){
        Intent i = new Intent(HomeActivity.this, MusicActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

    public void onSideMenu(View v){
        Intent i = new Intent(HomeActivity.this, SideMenuActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

    public void onSearch(View v){
        Intent i = new Intent(HomeActivity.this, SearchBlankActivity.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
}