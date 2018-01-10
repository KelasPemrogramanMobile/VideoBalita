package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register_Bayi extends AppCompatActivity {

        private EditText Rbayi, Rumur, Rtgllahir, Rberatbayi;
        private Button btnGetData;
        String nama, umur, ttl, beratbayi;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register__bayi);

            Rbayi = (EditText) findViewById(R.id.isiNmBayi);
            Rumur = (EditText) findViewById(R.id.isiumurbayi);
            Rtgllahir = (EditText) findViewById(R.id.isitgllahir);
            Rberatbayi = (EditText) findViewById(R.id.isiberatbayi);
            btnGetData = (Button) findViewById(R.id.btnambildata);

            btnGetData.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    nama = Rbayi.getText().toString();
                    umur = Rumur.getText().toString();
                    ttl = Rtgllahir.getText().toString();
                    beratbayi = Rberatbayi.getText().toString();


                    Intent go = new Intent(com.nurrahman.videobalita.Register_Bayi.this, informasibayi.class);
                    go.putExtra("nama", nama);
                    go.putExtra("umur", umur);
                    go.putExtra("ttl", ttl);
                    go.putExtra("beratbayi", beratbayi);
                    startActivity(go);

                    finish();

                }


            });
        }
    }


