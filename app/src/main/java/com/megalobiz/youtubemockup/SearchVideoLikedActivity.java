package com.megalobiz.youtubemockup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SearchVideoLikedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_video_liked);
    }

    public void onUnlike(View v){
        finish();
        overridePendingTransition(0, 0);
    }
}
