package com.example.android.depressiontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Soal2Activity extends AppCompatActivity {
    TextView TestResult;
    TextView Disclaimer;
    Button MainMenu;
    int nilaiInt;
    String terimaNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);

        TestResult = (TextView)findViewById(R.id.Hasilnya);
        Disclaimer = (TextView)findViewById(R.id.Keterangan);
        MainMenu = findViewById(R.id.TombolMenu);

        terimaNama = getIntent().getStringExtra("NamaUser");
        nilaiInt = getIntent().getIntExtra("nilai",0);

        if (nilaiInt <= 4){
            TestResult.setText("Hai, " + terimaNama + ", total score-mu adalah " + nilaiInt +
                    ". Hasil score-mu mengindikasikan bahwa kamu tidak memiliki depresi.");
        }
        else if (nilaiInt <= 9){
            TestResult.setText("Hai, " + terimaNama + ", total score-mu adalah " + nilaiInt +
                    ". Hasil score-mu mengindikasikan bahwa kamu tidak depresi secara klinis. " +
                    "Namun, kamu mungkin memiliki gejala ringan. Silahkan hubungi doktermu jika gejala memburuk dan mengganggu aktivitas harian.");
        }
        else if (nilaiInt <=14){
            TestResult.setText("Hai, " + terimaNama + ", total score-mu adalah " + nilaiInt +
                    ". Hasil score-mu mengindikasikan kamu mungkin tidak mengalami depresi berat. " +
                    "Namun kamu menunjukan gejala depresi yang cukup parah. Kami menyarankan agar kamu menghubungi doktermu");
        }
        else if (nilaiInt <=22){
            TestResult.setText("Hai, " + terimaNama + ", total score-mu adalah " + nilaiInt +
                    ". Hasil score-mu mengindikasikan kamu mengalami depresi berat, walaupun kamu mungkin tidak depresi secara klinis. " +
                    " Kami menyarankan agar kamu menghubungi doktermu");
        }
        else if (nilaiInt > 22){
            TestResult.setText("Hai, " + terimaNama + ", total score-mu adalah " + nilaiInt +
                    ". Hasil score-mu mengindikasikan kamu mengalami depresi berat. Silahkan temui doktermu untuk bantuan lebih lanjut");
        }


        Disclaimer.setText("Jangan menggunakan tes ini untuk membuat diagnosis. Tes ini tidak bisa menggantikan diagnosis profesional."
        + " Bila ragu dengan kondisi mu, silahkan hubungi dokter." + " Lihat tab info di menu utama untuk informasi lebih lanjut tentang depresi.");

        MainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(f);
            }
        });



    }
}
