package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Umur1th extends AppCompatActivity {

    Button btnVideoPertama, btnVideoKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umur1th);

        btnVideoPertama = (Button) findViewById(R.id.btnVideo1um1th);
        btnVideoKedua   = (Button) findViewById(R.id.btnVideo2Um1th);

        btnVideoPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Umur1th.this, VideoPertamaUmur1th.class);
                startActivity(intent);
            }
        });

        btnVideoKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Umur1th.this, VideoKeduaUmur1th.class);
                startActivity(intent);
            }
        });
     }
}
