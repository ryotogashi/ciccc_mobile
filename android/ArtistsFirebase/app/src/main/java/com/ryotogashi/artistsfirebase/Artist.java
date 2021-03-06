package com.ryotogashi.artistsfirebase;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Exclude;

import java.util.Date;

public class Artist {
    private String id;
    private String name;
    private String genre;
    private int rate;
    private Timestamp addedDate;

    // FireStore will use this to read data
    public Artist() {}

    public Artist(String name, String genre, int rate) {
        this.name = name;
        this.genre = genre;
        this.rate = rate;
        this.addedDate = new Timestamp(new Date());
    }

    // user @Exclude on the getter of id field to make sure
    // the id does not get sent to Firestroe on Save
    @Exclude
    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getRate() { return rate; }

    public Timestamp getAddedDate() {
        return addedDate;
    }
}
