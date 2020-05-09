package com.example.bookscardview;


public class Book {
    private String title;
    private String category;
    private String discription;
    private int thumbnail;
    private String bookPdfLink;
    public Book(){

    }
    public Book(String title, String category, String discription, int thumbnail, String bookPdfLink){
        this.title= title;
        this.category= category;
        this.discription= discription;
        this.thumbnail= thumbnail;
        this.bookPdfLink=bookPdfLink;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public String getDiscription() {
        return discription;
    }

    public String getBookPdfLink(){ return bookPdfLink;}

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookPdfLink(String bookPdfLink){ this.bookPdfLink= bookPdfLink;}

    }

