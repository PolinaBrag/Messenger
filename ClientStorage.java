package Messenger;

import java.util.ArrayList;

public class ClientStorage implements Storage<User> {

    ArrayList<User> users = new ArrayList<>();

    @Override
    public void addElement(User client) {
        if (!users.contains(client)) {
            users.add(client);
        }
    }

    @Override
    public void deleteElement(User client) {
        if (!users.isEmpty()) {
            users.remove(client);
        }
    }

}
