package solidprinciples.adhere.interfacesegregation;

public class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}