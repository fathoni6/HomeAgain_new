package com.example.homeagain.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.homeagain.R;
import com.example.homeagain.activity.LoginActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {

    Button btn_setting_profile,btn_keluar_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.profile);

        btn_setting_profile = findViewById(R.id.btn_setting_profile);

        btn_setting_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotosettingprofile = new Intent(ProfileActivity.this,ProfileActivity2.class);
                startActivity(gotosettingprofile);
            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.aduan:
                        startActivity(new Intent(getApplicationContext()
                                ,AduanActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.scan:
                        startActivity(new Intent(getApplicationContext()
                                ,ScanActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.pesan_layanan:
                        startActivity(new Intent(getApplicationContext()
                                ,PesanLayananActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext()
                                ,LoginActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;

            }
        });
    }
}