package solidprinciples.adhere.liskovsubstitution;

public class Rectangle implements Shape {
    protected int height;
    protected int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea() {
        return height * width;
    }
}