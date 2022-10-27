package ua.ithillel.homework13.util;

import ua.ithillel.homework13.interfaces.CallerService;
import ua.ithillel.homework13.interfaces.MailSenderService;

public class PhoneUtil implements CallerService, MailSenderService {

    @Override
    public void login() {
        CallerService.super.login();
    }

    @Override
    public String createMail(String mail) {
        System.out.println("Put message..");
        return mail;
    }

    @Override
    public void sendMail() {
        System.out.println("Send message..");
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void dropTheCall() {
        System.out.println("Call ended.");
    }
}
