package com.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
    Button btnExit;
    Button btnTambah;
    Button btnLihat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

         btnTambah = (Button)findViewById(R.id.btnTambah);
         btnLihat = (Button)findViewById(R.id.btnLihat);
         btnExit = (Button)findViewById(R.id.btnExit);

         btnTambah.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Dashboard.this,TambahData.class);
                 startActivity(intent);
             }
         });
         btnLihat.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Dashboard.this,TampilData.class);
                 startActivity(intent);
             }
         });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                finish();
            }
        });
    }
}