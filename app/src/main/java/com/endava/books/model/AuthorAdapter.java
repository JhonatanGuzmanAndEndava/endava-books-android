package com.endava.books.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.endava.books.R;

import java.util.List;

public class AuthorAdapter extends RecyclerView.Adapter<AuthorAdapter.AuthorViewHolder> {

    private List<ModelFactory.AuthorTemporal> authors;

    public AuthorAdapter(List<ModelFactory.AuthorTemporal> authors) {
        this.authors = authors;
    }

    @NonNull
    @Override
    public AuthorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AuthorViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.author_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AuthorViewHolder holder, int position) {
        holder.authorFirstName.setText(authors.get(position).getFirstName());
        holder.authorLastName.setText(authors.get(position).getLastName());
        holder.authorAge.setText(authors.get(position).getAge());
    }

    @Override
    public int getItemCount() {
        return authors.size();
    }

    class AuthorViewHolder extends RecyclerView.ViewHolder {

        ImageView authorImage;
        TextView authorFirstName;
        TextView authorLastName;
        TextView authorAge;

        public AuthorViewHolder(View itemView) {
            super(itemView);

            authorImage = itemView.findViewById(R.id.authorImage);
            authorFirstName = itemView.findViewById(R.id.authorFirstName);
            authorLastName = itemView.findViewById(R.id.authorLastName);
            authorAge = itemView.findViewById(R.id.authorAge);
        }
    }

}
