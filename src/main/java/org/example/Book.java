package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private final String title;
    private final int numberOfPages;
    private final int publicationYear;

    // Constructor with all parameters
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Overloaded constructor with only title
    public Book(String title) {
        this.title = title;
        this.numberOfPages = 0;
        this.publicationYear = 0;
    }


    // No-argument constructor with default values
    public Book() {
        this.title = "Unknown Title";
        this.numberOfPages = 0;
        this.publicationYear = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Main method
    public static void main(String[] args) {
        // Create an ArrayList to store books
        ArrayList<Book> books = new ArrayList<>();

        // Adding books using various constructors
        books.add(new Book("To Kill A Mockingbird", 281, 1960));
        books.add(new Book("A Brief History of Time", 256, 1988));
        books.add(new Book("Beautiful Code", 593, 2007));
        books.add(new Book("The Name of The Wind", 662, 2007));

        // Using overloaded constructors
        books.add(new Book("A New Book"));
        books.add(new Book());

        // Create scanner for user input
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("What information will be printed? ");
        String input = sc.nextLine();

        // Print book information based on user input
        if (input.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.getTitle() + ", " + book.getNumberOfPages() + " pages, " + book.getPublicationYear());
            }
        } else if (input.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
