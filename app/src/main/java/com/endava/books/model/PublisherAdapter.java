package com.endava.books.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.endava.books.R;

import java.util.List;

public class PublisherAdapter extends RecyclerView.Adapter<PublisherAdapter.PublisherViewHolder> {

    private List<ModelFactory.PublisherTemporal> publishers;

    public PublisherAdapter(List<ModelFactory.PublisherTemporal> publishers) {
        this.publishers = publishers;
    }

    @NonNull
    @Override
    public PublisherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PublisherViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.publisher_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PublisherViewHolder holder, int position) {
        holder.brand.setText(publishers.get(position).getBrand());
        holder.slogan.setText(publishers.get(position).getSlogan());
    }

    @Override
    public int getItemCount() {
        return publishers.size();
    }

    class PublisherViewHolder extends RecyclerView.ViewHolder {

        TextView brand;
        TextView slogan;

        public PublisherViewHolder(View itemView) {
            super(itemView);

            brand = itemView.findViewById(R.id.brandPublisher);
            slogan = itemView.findViewById(R.id.sloganPublisher);
        }
    }

}
