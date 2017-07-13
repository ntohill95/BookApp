package com.example.android.bookapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.author;

/**
 * Created by Niamh on 13/07/2017.
 */

public class BookAdaptor extends ArrayAdapter<Book> {

    public BookAdaptor(Activity context, ArrayList<Book> books){
        super(context, 0, books);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Book currentBook=getItem(position);
        TextView titleTextView = (TextView)listItemView.findViewById(R.id.book_title);
        titleTextView.setText(currentBook.getTitle());

        TextView authorTextView = (TextView)listItemView.findViewById(R.id.book_author);
        authorTextView.setText(currentBook.getTitle());

        return listItemView;
    }
}
