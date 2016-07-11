package com.megalobiz.youtubemockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SigninFocusedFilledActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_focused_filled);
    }

    public void onSubmitEmail(View v){
        Intent i = new Intent(SigninFocusedFilledActivity.this, SigninPasswordBlankActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }


}
