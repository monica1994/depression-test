package com.example.android.depressiontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Introduksi;
    Button StartTest;
    Button TestInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Introduksi = (TextView)findViewById(R.id.text1);
        StartTest = (Button)findViewById(R.id.MulaiTest);

        Introduksi.setText("Gunakan aplikasi ini untuk menguji kemungkinan kamu mengalami depresi dan menilai tingkat keparahan depresimu." +
                "Tes ini hanyalah alat uji coba sementara.");

        StartTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MulaiTesActivity.class);


                startActivity(i);
            }
        });

        TestInfo = (Button)findViewById(R.id.InfoTes);
        TestInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(getApplicationContext(),InfoTesActivity.class);

                startActivity(m);
            }
        });

    }
}
