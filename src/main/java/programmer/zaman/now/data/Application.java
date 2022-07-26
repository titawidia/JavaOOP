package programmer.zaman.now.data;

public class Application { // Static Block

    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
