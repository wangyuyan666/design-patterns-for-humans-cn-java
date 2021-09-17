package mediator;

public class MediatorMain {
    public static void main(String[] args) {
        ChatRoomMediator mediator = new ChatRoom();

        User johnDoe = new User("John Doe", mediator);
        User janeDoe = new User("Jane Doe", mediator);

        johnDoe.send("Hi there!");
        janeDoe.send("Hey!");
    }
}
