package solidprinciples.violation.dependencyinversion;

public class Manager {
    private Worker worker;

    public Manager() {
        this.worker = new Worker(); // Direct dependency on a concrete class
    }

    public void manage() {
        worker.work();
    }
}