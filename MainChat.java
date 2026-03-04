public class MainChat {

    public static void main(String[] args) {

        ChatMediator chat = new ChatMediator();

        User user1 = new User("Ali", chat);
        User user2 = new User("Nurdaulet", chat);
        User user3 = new User("Dana", chat);

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.send("Hello everyone!");
    }
}
