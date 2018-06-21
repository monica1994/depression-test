package com.example.android.depressiontest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoTesActivity extends AppCompatActivity {

    TextView Disclaimer;
    TextView WhatIsDepression;
    Button TombolMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tes);

        Disclaimer = findViewById(R.id.keteranganDisclaimer);
        WhatIsDepression = findViewById(R.id.apaItuDepresi);
        TombolMainMenu = findViewById(R.id.MainMenu);

        Disclaimer.setText("Please note: This self-test is meant to give you insight in your mood state. "+
        "This test is explicitly not suitable for diagnosis.This test can not replace professional help. When in doubt, please contact your general practitioner." +
        " No rights can be derived from the results of this test.");

        TombolMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
    public void browser1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nimh.nih.gov/health/publications/depression/index.shtml#pub6"));
        startActivity(browserIntent);
    }

    public void browser2(View view){
        Intent browser2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.moodjuice.scot.nhs.uk/depression.asp"));
        startActivity(browser2Intent);
    }

    public void browser3(View view){
        Intent browser3Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/herusantoso23/"));
        startActivity(browser3Intent);
    }

    public void browser4(View view){
        Intent browser4Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/herusantoso23/"));
        startActivity(browser4Intent);
    }


}
