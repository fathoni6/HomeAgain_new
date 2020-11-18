package com.example.homeagain.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeagain.item.Item;
import com.example.homeagain.R;

import java.util.List;

public class LainnyaAdapter extends RecyclerView.Adapter<LainnyaAdapter.ViewHolder> {

    private List<Item> list;
    Context context;


    public LainnyaAdapter(List<Item> list, Context context) {
        this.list = list;
        this.context = context;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        return new LainnyaAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{

        public TextView textView;
        public ImageView imageView;

        public ViewHolder(@NonNull View view) {
            super(view);

//            textView = view.findViewById(R.id.tvVersionName);
//            imageView = view.findViewById(R.id.imgVersionName);
        }
    }
}