package com.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class TambahData extends AppCompatActivity {

    Button btnBack;
    
    String[] kecamatan = {"Riau Silip", "Belinyu", "Sungailiat", "Pangkalpinang", "Pemali"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);

        Spinner spinner = findViewById(R.id.KC);

        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,kecamatan);

        btnBack = (Button)findViewById(R.id.button4);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perintah untuk kembali kehalaman berikutnya
                startActivity(new Intent(TambahData.this,Dashboard.class));
                finish();

            }
        });
    }
}