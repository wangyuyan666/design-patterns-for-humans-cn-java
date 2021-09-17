package mediator;

public class ChatRoom implements ChatRoomMediator {
    @Override
    public void showMessage(User user, String message) {
        System.out.println("xxxx-xx-xx" + " [" + user.getName() + "] " + message);
    }
}
