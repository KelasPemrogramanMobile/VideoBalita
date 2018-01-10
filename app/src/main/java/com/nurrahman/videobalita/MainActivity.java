package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button btnInformasiBunda, btnInformasiBayi, btnCaraMerawatBayi,btnVideo, btnOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCaraMerawatBayi = (Button) findViewById(R.id.btnCaraMerawatBayi);
        btnInformasiBunda = (Button) findViewById(R.id.btnInfoIbu);
        btnInformasiBayi = (Button) findViewById(R.id.btnInfoBayi);
        btnVideo =(Button) findViewById(R.id.btnVideo);
        btnOut = (Button) findViewById(R.id.btnOut);

        //Metode unutk klik tombol 1
        btnCaraMerawatBayi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menambahkan perintah dari kejadian tombol 1 klik
                Intent intent = new Intent(MainActivity.this,CaraMerawatBayi.class);
                startActivity(intent);
            }
        });

        btnInformasiBunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,informasibunda.class);
                startActivity(intent);
            }
        });

        btnInformasiBayi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,informasibayi.class);
                startActivity(intent);
            }
        });

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menambahkan perintah dari kejadian tombol 1 klik
                Intent intent = new Intent(MainActivity.this,Video.class);
                startActivity(intent);
            }
        });

        btnOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}