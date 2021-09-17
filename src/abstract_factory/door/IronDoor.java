package abstract_factory.door;

public class IronDoor implements Door {
    @Override
    public String getDescription() {
        return "I am an iron door";
    }
}
