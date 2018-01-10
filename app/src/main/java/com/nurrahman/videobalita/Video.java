package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Video extends AppCompatActivity {

    Button btn1th, btn2th, btn3th, btn4th, btn5th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        btn1th = (Button) findViewById(R.id.btn1th);
        btn2th = (Button) findViewById(R.id.btn2th);
        btn3th = (Button) findViewById(R.id.btn3th);
        btn4th = (Button) findViewById(R.id.btn4th);
        btn5th = (Button) findViewById(R.id.btn5th);

        btn1th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Video.this,Umur1th.class);
                startActivity(intent);
            }
        });

        btn2th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Video.this,Umur2th.class);
                startActivity(intent);
            }
        });

        btn3th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Video.this,Umur3th.class);
                startActivity(intent);
            }
        });

        btn4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Video.this,Umur4th.class);
                startActivity(intent);
            }
        });

        btn5th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Video.this,Umur5th.class);
                startActivity(intent);
            }
        });

    }
}
