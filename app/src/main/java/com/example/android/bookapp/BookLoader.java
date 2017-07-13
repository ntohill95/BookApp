package com.example.android.bookapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.example.android.bookapp.Book;
import com.example.android.bookapp.BookUtils;

import java.util.List;

/**
 * Created by Niamh on 13/07/2017.
 */

public class BookLoader extends AsyncTaskLoader<List<Book>>  {
    private static final String LOG_TAG = BookLoader.class.getName();
    /** Query URL */
    private String mUrl;

    public BookLoader(Context context, String url) {
        super(context);
        mUrl =url;
    }
    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Book> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Book> books = BookUtils.fetchBookData(mUrl);
        return books;
    }
}
