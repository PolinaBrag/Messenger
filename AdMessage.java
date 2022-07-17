package Messenger;

public class AdMessage extends Message {

    String comment;

    public AdMessage(String msg) {
        super(msg);
        this.comment = "Это реклама!";
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.msg, this.comment);
    }

}
