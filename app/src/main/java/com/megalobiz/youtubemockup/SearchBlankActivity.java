package com.megalobiz.youtubemockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SearchBlankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_blank);
    }

    public void onBack(View v){
        finish();
    }

    public void onTyping(View v){
        Intent i = new Intent(this, SearchFilledActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }
}
