package abstract_factory.factory;

import abstract_factory.door.Door;
import abstract_factory.door.IronDoor;
import abstract_factory.expert.Carpenter;
import abstract_factory.expert.DoorFittingExpert;

public class IronDoorFactory implements DoorFactory {

    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
}
