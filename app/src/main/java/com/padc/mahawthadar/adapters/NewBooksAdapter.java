package com.padc.mahawthadar.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.padc.mahawthadar.R;
import com.padc.mahawthadar.views.holders.NewBooksViewHolder;

public class NewBooksAdapter extends RecyclerView.Adapter<NewBooksViewHolder> {

    public NewBooksAdapter() {
    }

    @NonNull
    @Override
    public NewBooksViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        return new NewBooksViewHolder(inflater.inflate(R.layout.view_holder_new_books, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewBooksViewHolder newBooksViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
