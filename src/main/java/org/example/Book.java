package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private final String title;
    private final int numberOfPages;
    private final int publicationYear;
    // Constructor
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
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

    // Main
    public static void main(String[] args){
        // Array
        ArrayList<Book> books = new ArrayList<Book>();
        // Create books for user to query
       books.add(new Book("To Kill A Mockingbird", 281, 1960));
       books.add(new Book("A Brief History of Time", 256, 1988));
       books.add(new Book("Beautiful Code", 593, 2007));
       books.add(new Book("The Name of The Wind", 662, 2007));
       // Create scanner
        Scanner sc = new Scanner(System.in);
        // Ask user for input
        System.out.print("What information will be printed? ");
        String input = sc.nextLine();
        if(input.equals("everything")){
            for(Book book : books){
                System.out.println(book.getTitle()+", "+book.getNumberOfPages()+" pages, "+book.getPublicationYear());
            }
        }
        if(input.equals("name")){
            for(Book book : books){
                System.out.println(book.getTitle());
            }
        }

    }
}
