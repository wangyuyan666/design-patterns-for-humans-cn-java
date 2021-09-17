package mediator;

public class User {
    final String name;
    final ChatRoomMediator mediator;

    public User(String name, ChatRoomMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        this.mediator.showMessage(this, message);
    }
}
