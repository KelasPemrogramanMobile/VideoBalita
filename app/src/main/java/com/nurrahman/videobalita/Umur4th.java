package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Umur4th extends AppCompatActivity {

    Button btnVideoPertama, btnVideoKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umur4th);

        btnVideoPertama = (Button) findViewById(R.id.btnVideo1Um4th);
        btnVideoKedua   = (Button) findViewById(R.id.btnVideo2Um4th);

        btnVideoPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Umur4th.this, VideoPertamaUmur4th.class);
                startActivity(intent);
            }
        });

        btnVideoKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Umur4th.this, VideoKeduaUmur4th.class);
                startActivity(intent);
            }
        });
    }
}
