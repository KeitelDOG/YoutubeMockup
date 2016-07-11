package com.megalobiz.youtubemockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SearchVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_video);
    }

    public void onLike(View v){
        Intent i = new Intent(this, SearchVideoLikedActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }
}
