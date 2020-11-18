package com.example.homeagain.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homeagain.R;
import com.example.homeagain.adapter.LainnyaAdapter;
import com.example.homeagain.item.Item;

import java.util.ArrayList;
import java.util.List;

public class LainnyaActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    private List<Item> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lainnya);


        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerView);

        prepareItemData();

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 4));

        recyclerView.setAdapter(new LainnyaAdapter(list, this));
    }

    private void prepareItemData() {

        Item item = new Item(R.drawable.ic_cctv, "CCTV");
        list.add(item);
        item = new Item(R.drawable.ic_investasi, "investasi");
        list.add(item);
        item = new Item(R.drawable.ic_kekerasan, "Kekerasan");
    }
}