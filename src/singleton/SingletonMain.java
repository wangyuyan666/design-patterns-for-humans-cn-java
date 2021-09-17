package singleton;

public class SingletonMain {

    public static void main(String[] args) {
        President president1 = President.getInstance();
        President president2 = President.getInstance();

        System.out.println(president1.equals(president2)); // true
    }

}
