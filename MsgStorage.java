package Messenger;

import java.util.ArrayList;

public class MsgStorage implements Storage<Message> {

    ArrayList<Message> messages = new ArrayList<>();

    @Override
    public void addElement(Message message) {
        if (!messages.contains(message)) {
            messages.add(message);
        }
    }

    @Override
    public void deleteElement(Message message) {
        if (!messages.isEmpty()) {
            messages.remove(message);
        }
    }
}
