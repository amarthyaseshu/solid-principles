package solidprinciples.adhere.interfacesegregation;

// Adheres to ISP
//Clients should not be forced to depend on interfaces they do not use.
//Meaning:
//Instead of one big interface, create smaller, specific ones.
 // class should only implement methods that make sense for it.
public interface Printer {
    void print();
}