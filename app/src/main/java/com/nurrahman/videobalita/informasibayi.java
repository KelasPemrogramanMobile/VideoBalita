package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class informasibayi extends AppCompatActivity {
    TextView textNama, textumur, textTtl,textberatbayi;
    Intent nama, ttl, umur, berat;
    String strNama, strTtl, strumur, strberat;
    Button btnBack, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasibayi);

        textNama        = (TextView) findViewById(R.id.textNama);
        textberatbayi   =(TextView) findViewById(R.id.textberatbayi);
        textTtl         = (TextView) findViewById(R.id.textTtl);
        textumur       = (TextView) findViewById(R.id.textumur);
        btnBack         = (Button) findViewById(R.id.kembali);
        btnRegister = (Button) findViewById(R.id.btnRegister);

        nama = getIntent();
        strNama = nama.getStringExtra("nama");
        textNama.setText(strNama);

        ttl = getIntent();
        strTtl = ttl.getStringExtra("ttl");
        textTtl.setText(strTtl);

        umur = getIntent();
        strumur = umur.getStringExtra("umur");
        textumur.setText(strumur);

        berat = getIntent();
        strberat = berat.getStringExtra("beratbayi");
        textberatbayi.setText(strberat);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(informasibayi.this, Register_Bayi.class);
                startActivity(register);
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(informasibayi.this, MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });


    }
}



