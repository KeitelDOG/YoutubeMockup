package com.megalobiz.youtubemockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SigninPasswordBlankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_password_blank);
    }

    public void onTyping(View v){
        Intent i = new Intent(SigninPasswordBlankActivity.this, SigninPasswordFilledActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

}
