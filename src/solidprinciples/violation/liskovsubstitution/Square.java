package solidprinciples.violation.liskovsubstitution;

public class Square extends Rectangle {
    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // Violates LSP: Changes behavior unexpectedly
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Violates LSP: Changes behavior unexpectedly
    }
}