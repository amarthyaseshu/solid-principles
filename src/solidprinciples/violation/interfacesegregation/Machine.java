package solidprinciples.violation.interfacesegregation;

// Violates ISP
public interface Machine {
    void print();
    void scan();
    void fax();
}