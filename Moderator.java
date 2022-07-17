package Messenger;

public class Moderator extends Admin {

    public Moderator(String name, Chat chatroom) {
        super(name, chatroom);
    }

    void deleteUser(User user) {
        System.out.printf("Модератор %s удалил пользователя '%s'\n", this.getName(), user.getName());
    }
}
