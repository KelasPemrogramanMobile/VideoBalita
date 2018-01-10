package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Umur2th extends AppCompatActivity {

    Button btnVideoPertama, btnVideoKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umur2th);

        btnVideoPertama = (Button) findViewById(R.id.btnVideo1Um2th);
        btnVideoKedua   = (Button) findViewById(R.id.btnVideo2Um2th);

        btnVideoPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Umur2th.this, VideoPertamaUmur2th.class);
                startActivity(intent);
            }
        });

        btnVideoKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Umur2th.this, videoKeduaUmur2th.class);
                startActivity(intent);
            }
        });
    }
}
