package Arrays;

public class TryWithResourcesWithFinal implements AutoCloseable{

    private String resource;
    private TryWithResourcesWithFinal() {
        System.out.println("TryWithResources initialized");
    }
    private void printResourceName(){
        System.out.println("Resource 1");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Resource Closed");
    }

    public static void main(String [] args) throws Exception {
        TryWithResourcesWithFinal tryWithResources = new TryWithResourcesWithFinal(); //Effectively Final (do not change their values after initialization)
        try (tryWithResources) {
            System.out.println("Inside Try");
            tryWithResources.printResourceName();
        }
    }
}
