package Messenger;

public class Message {

    public String msg;

    public Message(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return String.format("%s", this.msg);
    }
}
