package com.megalobiz.youtubemockup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SigninFocusedBlankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_focused_blank);
    }

    public void onTyping(View v){
        Intent i = new Intent(SigninFocusedBlankActivity.this, SigninFocusedFilledActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

}
