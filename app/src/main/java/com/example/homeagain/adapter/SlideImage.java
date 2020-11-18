package com.example.homeagain.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.homeagain.slide.Landscape;
import com.example.homeagain.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class SlideImage extends SliderViewAdapter<SlideImage.SliderAdapterVH> {

    private List<Landscape> landscapeList;

    public SlideImage(List<Landscape>landscapeList) {
        this.landscapeList = landscapeList;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {

        Landscape landscape = landscapeList.get(position);

        viewHolder.imageViewBackground.setImageResource(landscape.getImage());

    }

    @Override
    public int getCount() {
        return landscapeList.size();
    }

    static class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        ImageView imageViewBackground;

        public SliderAdapterVH(View itemView) {
            super(itemView);

            imageViewBackground = itemView.findViewById(R.id.imageViewBackground);
        }
    }

}
