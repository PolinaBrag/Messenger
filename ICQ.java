package Messenger;

public class ICQ implements Chat {

    ClientStorage cs = new ClientStorage();
    MsgStorage ms = new MsgStorage();

    @Override
    public void sendMessage(Message text, User user) {
        if (text != null) {
            System.out.println(user.getName() + ": " + text);
        }
    }

    @Override
    public void appendClient(User client) {
        System.out.println(">>> добавился " + client.getName());
        System.out.print("\n");
        cs.addElement(client);
    }

    @Override
    public void deleteClient(User client) {
        System.out.println(">>> " + client.getName() + " удален из чата");
        System.out.print("\n");
        cs.deleteElement(client);

    }

    @Override
    public void appendMsg(Message msg) {
        ms.addElement(msg);

    }

    @Override
    public void deleteMsg(Message msg) {
        ms.deleteElement(msg);

    }
}
