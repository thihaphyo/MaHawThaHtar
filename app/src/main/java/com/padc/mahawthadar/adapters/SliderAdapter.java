package com.padc.mahawthadar.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.padc.mahawthadar.R;
import com.padc.mahawthadar.views.holders.SliderViewHolder;

public class SliderAdapter extends RecyclerView.Adapter<SliderViewHolder> {

    public SliderAdapter() {
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        return new SliderViewHolder(inflater.inflate(R.layout.view_holder_slider, viewGroup, false));

    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder sliderViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
