package org.example;
public record Book(String author, String title, String isbn) {
    
    @Override
    public String toString() {
        return "Title: " + title() + "\n" + "Author: " + author() + "\n" + "ISBN: " + isbn();
    }
}
