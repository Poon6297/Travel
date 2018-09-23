package com.example.poon6.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView mJapan;
    ImageView mChina;
    ImageView mMalaysia;
    ImageView mCambodia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJapan = (ImageView) findViewById(R.id.iv_japan);
        mChina = (ImageView) findViewById(R.id.iv_china);
        mMalaysia = (ImageView) findViewById(R.id.iv_malaysia);
        mCambodia = (ImageView) findViewById(R.id.iv_cambodia);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.iv_japan:
                Intent intentToStartJapan = new Intent(MainActivity.this, Japan.class);
                startActivity(intentToStartJapan);
                break;

            case R.id.iv_china:
                Intent intentToStartChina = new Intent(MainActivity.this, China.class);
                startActivity(intentToStartChina);
                break;

            case R.id.iv_cambodia:
                Intent intentToStartCambodia = new Intent(MainActivity.this, Cambodia.class);
                startActivity(intentToStartCambodia);
                break;

            case R.id.iv_malaysia:
                Intent intentToStartMalaysia = new Intent(MainActivity.this, Malaysia.class);
                startActivity(intentToStartMalaysia);
                break;

        }
    }
}
