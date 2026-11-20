package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("George Orwell", "1984", "918237326"));
        bookList.add(new Book("J.K Rowling", "Harry Potter and the philospher's stone", "9182341326"));
        bookList.add(new Book("George R.R Martin", "Game of thrones - Dance of the dragons", "918212041326"));

        bookList.getFirst().addRating(new Rating("mart", "asd", 9));
        bookList.getFirst().addRating(new Rating("mart", "asadwd", 8));
        bookList.getFirst().addRating(new Rating("mart", "asadjsiofe", 6));

        for (Book book : bookList) {
            System.out.println(book);
            System.out.println();
        }

    }
}
