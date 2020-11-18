package com.example.homeagain.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeagain.item.Item;
import com.example.homeagain.slide.Landscape;
import com.example.homeagain.R;
import com.example.homeagain.adapter.ItemAdapter;
import com.example.homeagain.adapter.SlideImage;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    private List<Item> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerView);

        prepareItemData();

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 4));

        recyclerView.setAdapter(new ItemAdapter(list, this));

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

        SliderView sliderView = findViewById(R.id.sliderView);

        List<Landscape> landscapeList = new ArrayList<>();
        landscapeList.add(new Landscape("Image 1", R.drawable.berita0));
        landscapeList.add(new Landscape("Image 2", R.drawable.berita1));
        landscapeList.add(new Landscape("Image 3", R.drawable.berita2));
        landscapeList.add(new Landscape("Image 4", R.drawable.berita1));
        landscapeList.add(new Landscape("Image 5", R.drawable.berita0));

        sliderView.setSliderAdapter(new SlideImage(landscapeList));
        sliderView.startAutoCycle();
        sliderView.setScrollTimeInSec(4);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);

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
                                ,ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    public void prepareItemData() {
        Item item = new Item(R.drawable.ic_cctv, "CCTV");
        list.add(item);
        item = new Item(R.drawable.ic_investasi, "investasi");
        list.add(item);
        item = new Item(R.drawable.ic_kekerasan, "Kekerasan");
        list.add(item);
        item = new Item(R.drawable.ic_kir_online, "Kir");
        list.add(item);
        item = new Item(R.drawable.ic_konsultasi_belajar_siswa, "Konsultasi \n Belajar");
        list.add(item);
        item = new Item(R.drawable.ic_kliping, "keliping");
        list.add(item);
        item = new Item(R.drawable.ic_konsultasi_hukum, "Konsultasi \n Hukum");
        list.add(item);
        item = new Item(R.drawable.ic_kunjungan, "kunjungan");
        list.add(item);
        item = new Item(R.drawable.ic_layanan_e_irtp, "Layanan \n E-IRTP");
        list.add(item);
        item = new Item(R.drawable.ic_penyelamatan_jiwa, "penyelamatan \n Jiwa");
        list.add(item);
        item = new Item(R.drawable.ic_perizinan_online, "Perizinan \n Online ");
        list.add(item);
        item = new Item(R.drawable.ic_alainnya, "Lainnya" );
        list.add(item);



    }



}