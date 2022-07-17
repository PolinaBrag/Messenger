package Messenger;

public class User {

    private String name;
    private Chat chatroom;

    public User(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }

    void sendMsg(Message text) {
        chatroom.sendMessage(text, this);
    }
}
