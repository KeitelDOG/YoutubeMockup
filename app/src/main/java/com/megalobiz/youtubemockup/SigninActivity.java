package com.megalobiz.youtubemockup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void onNext(View v){
        Intent i = new Intent(SigninActivity.this, SigninFocusedBlankActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

}
