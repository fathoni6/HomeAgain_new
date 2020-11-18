package com.example.homeagain.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.homeagain.R;
import com.example.homeagain.ui.HomeActivity;

public class AktivasiAkunActivity extends AppCompatActivity {

    Button btn_aktivasi_ulang_akun, btn_batal_aktivasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivasi_akun);

        btn_aktivasi_ulang_akun = findViewById(R.id.btn_aktivasi_ulang_akun);
        btn_batal_aktivasi = findViewById(R.id.btn_batal_aktivasi);

        btn_aktivasi_ulang_akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(AktivasiAkunActivity.this, HomeActivity.class);
                startActivity(gotohome);
            }
        });
        btn_batal_aktivasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtologin = new Intent(AktivasiAkunActivity.this, LoginActivity.class);
                startActivity(backtologin);
            }
        });
    }
}