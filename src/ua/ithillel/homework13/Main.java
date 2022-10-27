package ua.ithillel.homework13;

import ua.ithillel.homework13.interfaces.CallerService;
import ua.ithillel.homework13.interfaces.MailSenderService;
import ua.ithillel.homework13.interfaces.TelegramService;
import ua.ithillel.homework13.interfaces.ViberService;
import ua.ithillel.homework13.util.MessengerUtil;
import ua.ithillel.homework13.util.PhoneUtil;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        MessengerUtil messengerUtil = new MessengerUtil();
        TelegramService.runApp();
        messengerUtil.login();
        messengerUtil.createGroup();
        messengerUtil.readMessage();
        messengerUtil.deleteMessage();
        ViberService.addUser();
        messengerUtil.videoCall();

        PhoneUtil phoneUtil = new PhoneUtil();
        phoneUtil.login();
        phoneUtil.call();
        CallerService.autoAnswer();
        phoneUtil.dropTheCall();
        MailSenderService.chooseLetterRecipient();
        phoneUtil.createMail("Hello, test msg.");
        phoneUtil.sendMail();

        StringHelper stringHelper = new StringHelper();
        Optional correctEmail = stringHelper.emailValidation("whatislove@gmail.com");
        Optional wrongEmail = stringHelper.emailValidation("test$.com");
        System.out.println(correctEmail.get());
        System.out.println(wrongEmail.get());

    }
}
