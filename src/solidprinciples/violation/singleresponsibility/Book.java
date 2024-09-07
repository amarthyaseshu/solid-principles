package solidprinciples.violation.singleresponsibility;

// Violates SRP
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Responsibility 1: Print book details (This shouldn't be here)
    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
