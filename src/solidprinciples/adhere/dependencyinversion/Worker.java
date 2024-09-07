package solidprinciples.adhere.dependencyinversion;

public class Worker implements Workable {
    @Override
    public void work() {
        System.out.println("Working...");
    }
}