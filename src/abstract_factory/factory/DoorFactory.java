package abstract_factory.factory;

import abstract_factory.door.Door;
import abstract_factory.expert.DoorFittingExpert;

public interface DoorFactory {
    Door makeDoor();
    DoorFittingExpert makeFittingExpert();
}
