package abstract_factory.expert;

public class Welder implements DoorFittingExpert {
    @Override
    public String getDescription() {
        return "I can only fit iron doors";
    }
}
