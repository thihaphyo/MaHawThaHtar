package com.padc.mahawthadar.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.padc.mahawthadar.R;
import com.padc.mahawthadar.views.holders.FamousBookViewHolder;

public class FamousBookAdapter extends RecyclerView.Adapter {

    public FamousBookAdapter() {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        return new FamousBookViewHolder(inflater.inflate(R.layout.view_holder_famous_book, viewGroup, false));

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
