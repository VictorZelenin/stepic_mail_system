package mail_service_impl;

import Sendable.Sendable;
import mail_message.MailMessage;
import mail_package.MailPackage;
import mail_package.Package;
import mail_service.MailService;

/**
 * Created by User on 25.01.2016.
 */
public class Thief implements MailService {

    private final int minPriceOfPackage;
    private static int stolenValue;

    public Thief(int minPriceOfPackage) {
        this.minPriceOfPackage = minPriceOfPackage;
    }

    @Override
    public Sendable processMail(Sendable mail) {

        MailPackage mailPackage;


        if (mail instanceof MailMessage) {
            return mail;
        } else {
            mailPackage = (MailPackage) mail;
        }

        if (mailPackage.getContent().getPrice() < minPriceOfPackage) {
            return mail;
        } else {
            stolenValue += mailPackage.getContent().getPrice();

            System.out.println("HAHAHA , I have been stolen all");
            mail = new MailPackage(mailPackage.getFrom(), mailPackage.getTo(),
                    new Package("stones instead of " + mailPackage.getContent().getContent(), 0));


            return mail;
        }


    }

    public static int getStolenValue() {

        return stolenValue;
    }
}
