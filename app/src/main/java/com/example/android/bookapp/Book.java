package com.example.android.bookapp;

/**
 * Created by Niamh on 13/07/2017.
 */

public class Book {
    private String mAuthor;
    private String mTitle;
    private String mUrl;

    public Book(String author, String title, String url){
        mAuthor=author;
        mTitle=title;
        mUrl=url;
    }

    public String getAuthor(){
        return mAuthor;
    }
    public String getTitle(){
        return mTitle;
    }
    public String getUrl(){
        return mUrl;
    }

}
