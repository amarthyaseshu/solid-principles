package solidprinciples.adhere.liskovsubstitution;

// Adheres to LSP
//Subclasses should be substitutable for their base classes.
//Meaning:
//If B is a subclass of A, you should be able to replace A with B without breaking behavior. In
//simple terms - Wherever you use the parent, you should be able to use the child
public interface Shape {
    int getArea();
}
