package solidprinciples.adhere.singleresponsibility;

// Adheres to SRP
//Each class or module should focus on doing one thing.
//If a class has more than one responsibility, it becomes tightly coupled and harder to maintain.
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
}