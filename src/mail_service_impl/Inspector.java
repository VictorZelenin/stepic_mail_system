package mail_service_impl;

import Sendable.Sendable;
import mail_message.MailMessage;
import mail_package.MailPackage;
import mail_service.MailService;
import mail_service_exceptions.IllegalPackageException;
import mail_service_exceptions.StolenPackageException;

/**
 * Created by User on 25.01.2016.
 */
public class Inspector implements MailService {


    @Override
    public Sendable processMail(Sendable mail) {

        MailPackage currentPackage = null;

        if (mail instanceof MailMessage) {
            return mail;
        } else {
            currentPackage = (MailPackage) mail;
        }

        if (currentPackage.getContent().getContent().contains("weapons") ||
                currentPackage.getContent().getContent().contains("banned substance") ) {
            throw new IllegalPackageException("WARNING");
        }

        if (currentPackage.getContent().getContent().contains("stones")){
            throw new StolenPackageException("Stolen package has been detected!");
        }


        return mail ;
    }
}