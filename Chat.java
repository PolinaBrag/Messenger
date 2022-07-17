package Messenger;

interface Chat {
    void sendMessage(Message msg, User user);

    void appendClient(User user);

    void deleteClient(User user);

    void appendMsg(Message msg);

    void deleteMsg(Message msg);
}
