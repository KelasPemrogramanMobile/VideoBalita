package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class informasibunda extends AppCompatActivity {
    TextView textNama, textAlamat, textPassword, textumur, textTtl;
    Intent nama, alamat, ttl, password, umur;
    String strNama, strAlamat, strTtl, strPassword, strumur;
    Button btnBack, btnRegister;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasibunda);

        textNama        = (TextView) findViewById(R.id.textNama);
        textAlamat      = (TextView) findViewById(R.id.textAlamat);
        textTtl         = (TextView) findViewById(R.id.textTtl);
        textPassword    = (TextView) findViewById(R.id.textPassword);
        textumur       = (TextView) findViewById(R.id.textumur);
        btnBack         = (Button) findViewById(R.id.btnKembali);
        btnRegister         = (Button) findViewById(R.id.btnRegister);

        nama = getIntent();
        strNama = nama.getStringExtra("Nama");
        textNama.setText(strNama);

        alamat = getIntent();
        strAlamat = alamat.getStringExtra("Alamat");
        textAlamat.setText(strAlamat);

        ttl = getIntent();
        strTtl = ttl.getStringExtra("Ttl");
        textTtl.setText(strTtl);

        password = getIntent();
        strPassword = password.getStringExtra("Password");
        textPassword.setText(strPassword);

        umur = getIntent();
        strumur = umur.getStringExtra("umur");
        textumur.setText(strumur);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(informasibunda.this, registrasibunda.class);
                startActivity(register);
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(informasibunda.this, MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });


    }
}



