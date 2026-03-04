public interface IMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
