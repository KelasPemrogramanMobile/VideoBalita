package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Umur5th extends AppCompatActivity {

    Button btnVideoPertama, btnVideoKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umur5th);

        btnVideoPertama = (Button) findViewById(R.id.btnVideo1Um5th);
        btnVideoKedua   = (Button) findViewById(R.id.btnVideo2Um5th);

        btnVideoPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Umur5th.this, VideoPertamaUmur5th.class);
                startActivity(intent);
            }
        });

        btnVideoKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Umur5th.this, VideoKeduaUmur5th.class);
                startActivity(intent);
            }
        });
    }
}
