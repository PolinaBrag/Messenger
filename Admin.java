package Messenger;

public class Admin extends User {

    public Admin(String name, Chat chatroom) {
        super(name, chatroom);
    }

    void deleteMessage(Message msg) {
        System.out.printf("Админ %s удалил сообщение: '%s'\n", this.getName(), msg.msg);
    }

    void banUser(User user) {
        System.out.printf("Админ %s забанил пользователя '%s'\n", this.getName(), user.getName());
    }

    void inviteUser(User user) {
        System.out.printf("Админ %s пригласил пользователя '%s'\n", this.getName(), user.getName());
    }

}
