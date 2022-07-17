package Messenger;

public class MessengerApp {

  public static void main(String[] args) {
    ICQ icq = new ICQ();

    User client1 = new User("Вася", icq);
    User client2 = new User("Маша", icq);
    icq.appendClient(client1);
    icq.appendClient(client2);

    Message msg1 = new Message("привет всем!");
    client1.sendMsg(msg1);
    icq.appendMsg(msg1);

    AdMessage msg2 = new AdMessage("Продаю ботинки!");
    client2.sendMsg(msg2);
    icq.appendMsg(msg2);

    User client3 = new User("Коля", icq);
    icq.appendClient(client3);

    Admin client5 = new Admin("Иван", icq);
    icq.appendClient(client5);

    Message msg3 = new Message("Привет, я новый админ");
    client5.sendMsg(msg3);
    icq.appendMsg(msg3);

    client5.banUser(client2);
    client5.deleteMessage(msg2);
    icq.deleteMsg(msg2);

    User client4 = new User("Вальдемар", icq);
    client5.inviteUser(client4);
    icq.appendClient(client4);

    Moderator client6 = new Moderator("Петя", icq);
    icq.appendClient(client6);

    Message msg4 = new Message("Привет, я ваш модератор");
    client6.sendMsg(msg4);
    icq.appendMsg(msg4);

    client6.deleteUser(client4);
    icq.deleteClient(client4);

    PrinterConsole pc = new PrinterConsole();
    // выводим в консоль хранилище юзеров
    pc.printClientStorage(icq.cs.users);
    System.out.println("======");
    // выводим в консоль хранилище сообщений
    pc.printMsgStorage(icq.ms.messages);

  }
}
