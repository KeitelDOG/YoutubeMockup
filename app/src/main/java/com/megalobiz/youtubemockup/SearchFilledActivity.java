package com.megalobiz.youtubemockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SearchFilledActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_filled);
    }

    public void onBack(View v){
        finish();
        overridePendingTransition(0, 0);
    }

    public void onSearch(View v){
        Intent i = new Intent(this, SearchResultsActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }
}
