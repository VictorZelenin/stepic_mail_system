package main;

import Sendable.Sendable;
import mail_package.MailPackage;
import mail_package.Package;

/**
 * Created by User on 25.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        Sendable mail = new MailPackage("Doug", "Bob",new Package("This is a present, Bob", 100));


        Thief mailThief = new Thief(60);

        mailThief.processMail(mail);

        System.out.println(Thief.getStolenValue());




        //Logger spyLogger = Logger.getGlobal();

        //new mail_service_impl.Spy(spyLogger).processMail(mail);

    }
}
