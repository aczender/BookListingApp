package com.example.h78617.booklistingapp;

public class Book {

    private String mTitle;
    private String mAuthor;
    private String mDate;
    private String mUrl;

    public Book(String title, String author, String date, String url) {
        mTitle = title;
        mAuthor = author;
        mDate = date;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

}