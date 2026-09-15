package solidprinciples.adhere.dependencyinversion;

// Adheres to DIP
//Depend on abstractions, not on concrete implementations.
//Meaning:
//High-level modules should not depend on low-level modules.
//Both should depend on abstractions (interfaces).
public interface Workable {
    void work();
}