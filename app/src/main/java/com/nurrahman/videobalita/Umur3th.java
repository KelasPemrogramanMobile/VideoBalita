package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Umur3th extends AppCompatActivity {

    Button btnVideoPertama, btnVideoKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umur3th);

        btnVideoPertama = (Button) findViewById(R.id.btnVideo1Um3th);
        btnVideoKedua   = (Button) findViewById(R.id.btnVideo2Um3th);

        btnVideoPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Umur3th.this, VideoPertamaUmur3th.class);
                startActivity(intent);
            }
        });

        btnVideoKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Umur3th.this, VideoKeduaUmur3th.class);
                startActivity(intent);
            }
        });
    }
}
