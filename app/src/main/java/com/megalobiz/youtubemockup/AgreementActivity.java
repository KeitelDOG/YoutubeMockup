package com.megalobiz.youtubemockup;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AgreementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
    }

    public void onAccept(View v){
        ImageView ivSubmitPassword = (ImageView) findViewById(R.id.ivAgree);
        ivSubmitPassword.setImageDrawable(getResources().getDrawable(R.drawable.scn_07_sign_in_loading));

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i = new Intent(AgreementActivity.this, HomeActivity.class);
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        }, 3000);

    }
}
