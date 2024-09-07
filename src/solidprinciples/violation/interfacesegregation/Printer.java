package solidprinciples.violation.interfacesegregation;

public class Printer implements Machine {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        // Unnecessary
    }

    @Override
    public void fax() {
        // Unnecessary
    }
}