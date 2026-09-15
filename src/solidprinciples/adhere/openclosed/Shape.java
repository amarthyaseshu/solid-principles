package solidprinciples.adhere.openclosed;

// Adheres to OCP
//You should be able to add new functionality without modifying existing code.
//This avoids breaking old code when introducing new behavior.
//It's all about adding instead of editing so you don't accidentally break something that already works fine.
public interface Shape {
    double calculateArea();
}