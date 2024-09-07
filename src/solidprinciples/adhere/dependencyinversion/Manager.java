package solidprinciples.adhere.dependencyinversion;

public class Manager {
    private Workable worker;

    public Manager(Workable worker) { // Inverted dependency on abstraction
        this.worker = worker;
    }

    public void manage() {
        worker.work();
    }
}