package com.nurrahman.videobalita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registrasibunda extends AppCompatActivity {
    private EditText edNamaBunda, edAlamatRumah, edTTL, edPswrd, edUmur;
    private Button btnGetData;
    String nama, alamat, ttl, password, umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasibunda);

       edNamaBunda =(EditText) findViewById(R.id.isiNamaBunda);
       edAlamatRumah=(EditText) findViewById(R.id.IsiAlamat);
       edTTL=(EditText) findViewById(R.id.isiTTL);
       edPswrd=(EditText) findViewById(R.id.Isipaswrd);
       edUmur=(EditText) findViewById(R.id.isiUmur);
       btnGetData = (Button) findViewById(R.id.btnambildata);

        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama            = edNamaBunda.getText().toString();
                alamat          = edAlamatRumah.getText().toString();
                ttl             = edTTL.getText().toString();
                password        = edPswrd.getText().toString();
                umur            = edUmur.getText().toString();


                Intent go = new Intent(registrasibunda.this, informasibunda.class);
                go.putExtra("Nama", nama);
                go.putExtra("Alamat", alamat);
                go.putExtra("Ttl", ttl);
                go.putExtra("Password", password);
                go.putExtra("umur", umur);
                startActivity(go);

                finish();

            }


        });
    }
}
