package abstract_factory.factory;

import abstract_factory.door.Door;
import abstract_factory.door.WoodenDoor;
import abstract_factory.expert.DoorFittingExpert;
import abstract_factory.expert.Welder;

public class WoodenDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
}
