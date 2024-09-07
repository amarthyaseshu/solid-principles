package solidprinciples.adhere.openclosed;

public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea(); // No need to modify this when adding new shapes
    }
}