package edu.example;

public class LibraryApp {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin");
        System.out.println("Library book: " + book.description());
    }
}
