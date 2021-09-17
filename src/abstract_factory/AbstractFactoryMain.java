package abstract_factory;

import abstract_factory.door.Door;
import abstract_factory.expert.DoorFittingExpert;
import abstract_factory.factory.IronDoorFactory;
import abstract_factory.factory.WoodenDoorFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        WoodenDoorFactory woodenFactory = new WoodenDoorFactory();
        Door door1 = woodenFactory.makeDoor();
        DoorFittingExpert doorFittingExpert1 = woodenFactory.makeFittingExpert();
        System.out.println(door1.getDescription());// Output: I am a wooden door
        System.out.println(doorFittingExpert1.getDescription());// Output: I can only fit wooden doors

        IronDoorFactory ironDoorFactory = new IronDoorFactory();
        Door door2 = ironDoorFactory.makeDoor();
        DoorFittingExpert doorFittingExpert2 = ironDoorFactory.makeFittingExpert();
        System.out.println(door2.getDescription()); // Output: I am an iron door
        System.out.println(doorFittingExpert2.getDescription());// Output: I can only fit iron doors
    }

}
