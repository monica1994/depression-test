package com.example.android.depressiontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.security.cert.PolicyQualifierInfo;

public class Soal1Activity extends AppCompatActivity {

    String Nama;
    TextView Instruction;
    TextView Question1;
    RadioButton ck1;
    RadioButton ck2;
    RadioButton ck3;
    RadioButton ck4;
    TextView Question2;
    RadioButton ck5;
    RadioButton ck6;
    RadioButton ck7;
    RadioButton ck8;
    TextView Question3;
    RadioButton ck9;
    RadioButton ck10;
    RadioButton ck11;
    RadioButton ck12;
    TextView Question4;
    RadioButton ck13;
    RadioButton ck14;
    RadioButton ck15;
    RadioButton ck16;
    TextView Question5;
    RadioButton ck17;
    RadioButton ck18;
    RadioButton ck19;
    RadioButton ck20;
    TextView Question6;
    RadioButton ck21;
    RadioButton ck22;
    RadioButton ck23;
    RadioButton ck24;
    TextView Question7;
    RadioButton ck25;
    RadioButton ck26;
    RadioButton ck27;
    RadioButton ck28;
    TextView Question8;
    RadioButton ck29;
    RadioButton ck30;
    RadioButton ck31;
    RadioButton ck32;
    TextView Question9;
    RadioButton ck33;
    RadioButton ck34;
    RadioButton ck35;
    RadioButton ck36;
    TextView Question10;
    RadioButton ck37;
    RadioButton ck38;
    RadioButton ck39;
    RadioButton ck40;
    Button Next;

    int Nilai1 = 0, Nilai2 = 0, Nilai3 = 0, Nilai4 = 0, Nilai5 = 0, Nilai6 = 0, Nilai7 = 0, Nilai8 = 0, Nilai9 = 0, Nilai10 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);
        Nama = getIntent().getStringExtra("NamaUser");
        Instruction = findViewById(R.id.Instruksi);
        Question1 = findViewById(R.id.Soal1);
        ck1 = findViewById(R.id.CheckBox1);
        ck2 = findViewById(R.id.CheckBox2);
        ck3 = findViewById(R.id.CheckBox3);
        ck4 = findViewById(R.id.CheckBox4);
        Question2 = findViewById(R.id.Soal2);
        ck5 = findViewById(R.id.CheckBox5);
        ck6 = findViewById(R.id.CheckBox6);
        ck7 = findViewById(R.id.CheckBox7);
        ck8 = findViewById(R.id.CheckBox8);
        Question3 = findViewById(R.id.Soal3);
        ck9 = findViewById(R.id.CheckBox9);
        ck10 = findViewById(R.id.CheckBox10);
        ck11 = findViewById(R.id.CheckBox11);
        ck12 = findViewById(R.id.CheckBox12);
        Question4 = findViewById(R.id.Soal4);
        ck13 = findViewById(R.id.CheckBox13);
        ck14 = findViewById(R.id.CheckBox14);
        ck15 = findViewById(R.id.CheckBox15);
        ck16 = findViewById(R.id.CheckBox16);
        Question5 = findViewById(R.id.Soal5);
        ck17 = findViewById(R.id.CheckBox17);
        ck18 = findViewById(R.id.CheckBox18);
        ck19 = findViewById(R.id.CheckBox19);
        ck20 = findViewById(R.id.CheckBox20);
        Question6 = findViewById(R.id.Soal6);
        ck21 = findViewById(R.id.CheckBox21);
        ck22 = findViewById(R.id.CheckBox22);
        ck23 = findViewById(R.id.CheckBox23);
        ck24 = findViewById(R.id.CheckBox24);
        Question7 = findViewById(R.id.Soal7);
        ck25 = findViewById(R.id.CheckBox25);
        ck26 = findViewById(R.id.CheckBox26);
        ck27 = findViewById(R.id.CheckBox27);
        ck28 = findViewById(R.id.CheckBox28);
        Question8 = findViewById(R.id.Soal8);
        ck29 = findViewById(R.id.CheckBox29);
        ck30 = findViewById(R.id.CheckBox30);
        ck31 = findViewById(R.id.CheckBox31);
        ck32 = findViewById(R.id.CheckBox32);
        Question9 = findViewById(R.id.Soal9);
        ck33 = findViewById(R.id.CheckBox33);
        ck34 = findViewById(R.id.CheckBox34);
        ck35 = findViewById(R.id.CheckBox35);
        ck36 = findViewById(R.id.CheckBox36);
        Question10 = findViewById(R.id.Soal10);
        ck37 = findViewById(R.id.CheckBox37);
        ck38 = findViewById(R.id.CheckBox38);
        ck39 = findViewById(R.id.CheckBox39);
        ck40 = findViewById(R.id.CheckBox40);
        Next = findViewById(R.id.TombolNext);
        ck1.setChecked(true);
        ck5.setChecked(true);
        ck9.setChecked(true);
        ck13.setChecked(true);
        ck17.setChecked(true);
        ck21.setChecked(true);
        ck25.setChecked(true);
        ck29.setChecked(true);
        ck33.setChecked(true);
        ck37.setChecked(true);


        Instruction.setText("Selama 2 minggu terakhir, seberapa sering kamu terganggu dengan masalah berikut?");


        Question1.setText("Sedikitnya minat atau kesenangan dalam melakukan sesuatu");

        ck1.setText("Tidak sama sekali");
        ck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck1.isChecked()==true) {
                Nilai1 = 0;
                }
            }
        });

        ck2.setText("Beberapa hari");
        ck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck2.isChecked()==true){
                Nilai1 = 1;
                }
            }
        });

        ck3.setText("Lebih dari setengah hari");
        ck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck3.isChecked()==true){
                  Nilai1 = 2;
                }
            }
        });

        ck4.setText("Hampir setiap hari");
        ck4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck4.isChecked()==true){
                    Nilai1 = 3;
                }
            }
        });


        Question2.setText("Merasa sedih, tertekan, dan putus asa");

        ck5.setText("Tidak sama sekali");
        ck5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck5.isChecked()==true){
                    Nilai2 = 0;
                }
            }
        });

        ck6.setText("Beberapa hari");
        ck6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck6.isChecked()==true){
                    Nilai2 = 1;
                }
            }
        });

        ck7.setText("Lebih dari setengah hari");
        ck7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck7.isChecked()==true){
                    Nilai2 = 2;
                }
            }
        });

        ck8.setText("Hampir setiap hari");
        ck8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck8.isChecked()==true){
                    Nilai2 = 3;
                }
            }
        });

        Question3.setText("Sulit untuk tidur dan tidur nyenyak, atau tidur terlalu sering");

        ck9.setText("Tidak sama sekali");
        ck9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck9.isChecked()==true){
                  Nilai3 = 0;
                }
            }
        });

        ck10.setText("Beberapa hari");
        ck10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck10.isChecked()==true){
                    Nilai3 = 1;
                }
            }
        });

        ck11.setText("Lebih dari setengah hari");
        ck11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck11.isChecked()==true){
                    Nilai3 = 2;
                }
            }
        });

        ck12.setText("Hampir setiap hari");
        ck12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck12.isChecked()==true){
                    Nilai3 = 3;
                }
            }
        });


        Question4.setText("Merasa lelah dan sedikit energi");


        ck13.setText("Tidak sama sekali");
        ck13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck13.isChecked()==true){
                   Nilai4 = 0;
                }
            }
        });

        ck14.setText("Beberapa hari");
        ck14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck14.isChecked()==true){
                    Nilai4 = 1;
                }
            }
        });

        ck15.setText("Lebih dari setengah hari");
        ck15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck15.isChecked()==true){
                    Nilai4 = 2;
                }
            }
        });

        ck16.setText("Hampir setiap hari");
        ck16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck16.isChecked()==true){
                    Nilai4 = 3;
                }
            }
        });

        Question5.setText("Nafsu makan berkurang atau berlebihan");

        ck17.setText("Tidak sama sekali");
        ck17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck17.isChecked()==true){
                    Nilai5 = 0;
                }
            }
        });

        ck18.setText("Beberapa hari");
        ck18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck18.isChecked()==true){
                    Nilai5 = 1;
                }
            }
        });

        ck19.setText("Lebih dari setengah hari");
        ck19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck19.isChecked()==true){
                    Nilai5 = 2;
                }
            }
        });

        ck20.setText("Hampir setiap hari");
        ck20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck20.isChecked()==true){
                    Nilai5 = 3;
                }
            }
        });



        Question6.setText("Merasa buruk tentang dirimu - atau seseorang yang gagal atau merasa telah mengecewakan diri sendiri atau keluargamu");

        ck21.setText("Tidak sama sekali");
        ck21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck21.isChecked()==true){
                   Nilai6 = 0;
                }
            }
        });

        ck22.setText("Beberapa hari");
        ck22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck22.isChecked()==true){
                    Nilai6 = 1;
                }
            }
        });

        ck23.setText("Lebih dari setengah hari");
        ck23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck23.isChecked()==true){
                    Nilai6 = 2;
                }
            }
        });


        ck24.setText("Hampir setiap hari");
        ck24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck24.isChecked()==true){
                    Nilai6 = 3;
                }
            }
        });



        Question7.setText("Sulit konsentrasi dalam mengerjakan sesuatu, seperti membaca koran atau menonton");

        ck25.setText("Tidak sama sekali");
        ck25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck25.isChecked()==true){
                    Nilai7 = 0;
                }
            }
        });

        ck26.setText("Beberapa hari");
        ck26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck26.isChecked()==true){
                    Nilai7 = 1;
                }
            }
        });

        ck27.setText("Lebih dari setengah hari");
        ck27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck27.isChecked()==true){
                    Nilai7 = 2;
                }
            }
        });

        ck28.setText("Hampir setiap hari");
        ck28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck28.isChecked()==true){
                    Nilai7 = 3;
                }
            }
        });

        Question8.setText("Melambatnya pergerakan dan cara bicara yang dapat disadari orang lain. Atau sebaliknya - merasa gelisah sehingga bergerak lebih banyak dari biasanya");

        ck29.setText("Tidak sama sekali");
        ck29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck29.isChecked()==true){
                   Nilai8 = 0;
                }
            }
        });

        ck30.setText("Beberapa hari");
        ck30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck30.isChecked()==true){
                    Nilai8 = 1;
                }
            }
        });

        ck31.setText("Lebih dari setengah hari");
        ck31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck31.isChecked()==true){
                    Nilai8 = 2;
                }
            }
        });

        ck32.setText("Hampir setiap hari");
        ck32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck32.isChecked()==true){
                    Nilai8 = 3;
                }
            }
        });

        Question9.setText("Berpikiran bahwa mati lebih baik atau berusaha melukai diri sendiri");

        ck33.setText("Tidak sama sekali");
        ck33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck33.isChecked()==true){
                    Nilai9 = 0;
                }
            }
        });

        ck34.setText("Beberapa hari");
        ck34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck34.isChecked()==true){
                    Nilai9 = 1;
                }
            }
        });

        ck35.setText("Lebih dari setengah hari");
        ck35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck35.isChecked()==true){
                    Nilai9 = 2;
                }
            }
        });

        ck36.setText("Hampir setiap hari");
        ck36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck36.isChecked()==true){
                    Nilai9 = 3;
                }
            }
        });

        Question10.setText("Jika kamu mengalami masalah, seberapa sulit kamu melakukan pekerjaanmu," +
                "mengurus hal-hal dirumah, atau bergaul dengan orang lain?");

        ck37.setText("Tidak sulit sama sekali");
        ck37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck37.isChecked()==true){
                    Nilai10 = 0;
                }
            }
        });

        ck38.setText("Agak sulit");
        ck38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck38.isChecked()==true){
                    Nilai10 = 1;
                }
            }
        });

        ck39.setText("Sangat sulit");
        ck39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck39.isChecked()==true){
                    Nilai10 = 2;
                }
            }
        });

        ck40.setText("Sangat sulit sekali");
        ck40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck40.isChecked()==true){
                    Nilai10 = 3;
                }
            }
        });


        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int NilaiTotal = Nilai1 + Nilai2 + Nilai3 + Nilai4 + Nilai5 + Nilai6 + Nilai7 + Nilai8 + Nilai9 + Nilai10;


                Intent i=new Intent(getApplication(),Soal2Activity.class);
                i.putExtra("nilai", NilaiTotal);
                i.putExtra("NamaUser", Nama);
                startActivity(i);
            }
        });
    }
}
