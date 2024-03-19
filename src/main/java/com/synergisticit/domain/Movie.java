package com.synergisticit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class Movie {


    @Id
    @GeneratedValue
    private int mId;


    private String title;

    private String genre;
    private String rating;
    private int price;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public Movie(){

    }

    public Movie(int mId, String title, String genre, String rating, int price){
        this.mId = mId;
        this.title= title;
        this.genre= genre;
        this.rating = rating;
        this.price = price;
    }



    @Override
    public String toString() {
        return "Movie [Id: "+ mId + ", Name="+ title + ", genre=" + genre + ", rating=" + rating + ", price = " + price
                + "]";
    }

}
