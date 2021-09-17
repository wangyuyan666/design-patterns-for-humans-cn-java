package singleton;

public class President {

    private static President sInstance;

    private President() {
        // Hide the constructor
    }

    public static President getInstance() {
        if (sInstance == null) {
            sInstance = new President();
        }
        return sInstance;
    }

    public void doSth() {
        System.out.println("do something");
    }
}
