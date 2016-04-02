package mail_service_impl;

import Sendable.Sendable;
import mail_message.MailMessage;
import mail_package.MailPackage;
import mail_service.MailService;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by User on 25.01.2016.
 */
public class Spy implements MailService {

    Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }


    @Override
    public Sendable processMail(Sendable mail) {


        MailMessage message = null;

        if (mail instanceof MailPackage) {
            return null;
        } else {
            message = (MailMessage) mail;
        }

        Object[] parametersOfTarget = new Object[]{message.getFrom(), message.getTo(), message.getMessage()};
        Object[] parametersOfUsual = new Object[]{message.getFrom(), message.getTo()};


        if (message.getFrom() == "Austin Powers" || message.getTo() == "Austin Powers") {
            logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"", parametersOfTarget);
        } else {
            logger.log(Level.INFO, "Usual correspondence: from {0} to {1}", parametersOfUsual);
        }

        return null;
    }
}
