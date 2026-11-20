package org.example;

import java.util.List;

public record Book(String author, String title, String isbn, List<Rating> ratingList) {
    
    public void addRating(Rating rating) {
        if (ratingList.)
    }

    @Override
    public String toString() {
        return "Title: " + title() + "\n" + "Author: " + author() + "\n" + "ISBN: " + isbn();
    }
}
