package com.example.homeagain.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.homeagain.R;
import com.example.homeagain.ui.HomeActivity;

public class LupaPasswordActivity extends AppCompatActivity {

    Button btn_kode_verifikasi,btn_batal_lupa_psswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        btn_kode_verifikasi = findViewById(R.id.btn_kode_verifikasi);
        btn_batal_lupa_psswd = findViewById(R.id.btn_batal_lupa_psswd);

        btn_kode_verifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(LupaPasswordActivity.this, HomeActivity.class);
                startActivity(gotohome);
            }
        });

        btn_batal_lupa_psswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtodaftar = new Intent(LupaPasswordActivity.this,DaftarActivity.class);
                startActivity(backtodaftar);
            }
        });
    }
}