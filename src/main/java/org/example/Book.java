package org.example;

import java.util.ArrayList;
import java.util.List;

public record Book(String author, String title, String isbn, List<Rating> ratingList) {

    public Book(String author, String title, String isbn) {
        this(author, title, isbn, new ArrayList<>());
    }
    
    public boolean addRating(Rating rating) {
        for (Rating r : ratingList) {
            if (rating.getEmail().equalsIgnoreCase(r.getEmail())) {
                return false;
            }
        }
        ratingList.add(rating);
        return true;
    }

    private double getRatingAvergae() {
        int sum = 0;
        int i = 0;
        for (Rating rating : ratingList) {
            sum += rating.getGrade();
            i++;
        }

        return sum / (double) i;
    }

    @Override
    public String toString() {
        return "Title: " + title() + "\n" + "Author: " + author() + "\n" + "ISBN: " + isbn() + "\n" + "Rating: " + getRatingAvergae();
    }
}
