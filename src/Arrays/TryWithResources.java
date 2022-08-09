package Arrays;

public class TryWithResources implements AutoCloseable{

    private String resource;
    private TryWithResources() {
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
        try (TryWithResources tryWithResources = new TryWithResources()) {
            System.out.println("Inside Try");
            tryWithResources.printResourceName();
        }
    }
}
