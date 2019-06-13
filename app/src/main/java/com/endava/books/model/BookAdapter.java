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

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private List<ModelFactory.BookTemporal> books;

    public BookAdapter(List<ModelFactory.BookTemporal> books) {
        this.books = books;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.book_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        holder.bookNameText.setText(books.get(position).getName());
        holder.authorNameText.setText(books.get(position).getAuthor());
        holder.publisherNameText.setText(books.get(position).getPublisher());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class BookViewHolder extends RecyclerView.ViewHolder {

        ImageView bookCover;
        TextView bookNameText;
        TextView authorNameText;
        TextView publisherNameText;

        public BookViewHolder(View itemView) {
            super(itemView);

            bookCover = itemView.findViewById(R.id.authorImage);
            bookNameText = itemView.findViewById(R.id.authorFirstName);
            authorNameText = itemView.findViewById(R.id.authorLastName);
            publisherNameText = itemView.findViewById(R.id.authorAge);
        }
    }

}
