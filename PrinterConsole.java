package Messenger;

import java.util.ArrayList;

public class PrinterConsole implements Printer {

    @Override
    public void printMsgStorage(ArrayList<Message> storage) {
        for (Message msg : storage) {
            System.out.println(msg.msg);
        }

    }

    @Override
    public void printClientStorage(ArrayList<User> storage) {
        for (User user : storage) {
            System.out.println(user.getName());
        }
    }

}
