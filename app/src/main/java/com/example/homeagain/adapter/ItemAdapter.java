package com.example.homeagain.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.homeagain.R;
import com.example.homeagain.item.Item;
import com.example.homeagain.ui.LainnyaActivity;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private List<Item> list;
    Context context;


    public ItemAdapter(List<Item> list, Context context) {
        this.list = list;
        this.context = context;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public ImageView imageView;


        public MyViewHolder(View view) {
            super(view);

            textView = view.findViewById(R.id.tvVersionName);
            imageView = view.findViewById(R.id.imgVersionName);
        }


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.textView.setText(list.get(position).getVersionName());
        holder.imageView.setImageResource(list.get(position).getImageResourseId());


        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (list.get(position).getVersionName()) {
                    case "Lainnya":
                        context.startActivity(new Intent(context, LainnyaActivity.class));
                        break;
                }
                Toast.makeText(context, "Android Version " + holder.textView.getText() + ": Clicked", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}

