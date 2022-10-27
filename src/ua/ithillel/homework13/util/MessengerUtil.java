package ua.ithillel.homework13.util;

import ua.ithillel.homework13.interfaces.TelegramService;
import ua.ithillel.homework13.interfaces.ViberService;

public class MessengerUtil implements TelegramService, ViberService {

    private static String msg = "Need to be done by tomorrow.";

    @Override
    public void login() {
        TelegramService.super.login();
    }

    @Override
    public void readMessage() {
        System.out.println(msg);
    }

    @Override
    public void deleteMessage() {
        msg = null;
        System.out.println("Message delete: " + msg);

    }

    @Override
    public void videoCall() {
        System.out.println("A video call is in progress.");
    }

    @Override
    public void createGroup() {
        String groupName = "test777";
        System.out.println("You create group  with name " + groupName);
    }
}
