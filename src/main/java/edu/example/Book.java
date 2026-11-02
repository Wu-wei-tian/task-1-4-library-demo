package edu.example;

public record Book(String title, String author) {
    public String description() {
        return title + " by " + author;
    }
}
