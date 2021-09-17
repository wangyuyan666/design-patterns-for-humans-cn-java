package simple_factory;

class SimpleFactoryMain {

    public static void main(String[] args) {

        Door door1 = DoorFactory.makeDoor(100, 200);
        System.out.println("width = " + door1.getWidth());
        System.out.println("height = " + door1.getHeight());


        Door door2 = DoorFactory.makeDoor(50, 100);

    }

}
