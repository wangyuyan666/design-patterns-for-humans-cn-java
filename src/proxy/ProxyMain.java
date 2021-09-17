package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        SecuredDoor securedDoor = new SecuredDoor(new LabDoor());
        securedDoor.open("invalid"); // Big no! It ain't possible.

        securedDoor.open("$ecr@t"); // Opening lab door
        securedDoor.close(); // Closing lab door
    }
}
