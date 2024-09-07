package solidprinciples.adhere.singleresponsibility;

public class BookPrinter {
    public void printDetails(Book book) {
        System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
    }
}