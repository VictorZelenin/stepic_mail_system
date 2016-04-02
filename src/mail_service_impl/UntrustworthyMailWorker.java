package mail_service_impl;

import Sendable.Sendable;
import mail_service.MailService;

/**
 * Created by User on 25.01.2016.
 */
public class UntrustworthyMailWorker implements MailService {

    private MailService[] mailServices;
    private RealMailService realMailService;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
        realMailService = new RealMailService();

    }


    @Override
    public Sendable processMail(Sendable mail) {

        Sendable temp = null;

        for (int i = 0; i < mailServices.length; i++) {

            if (i == 0) {
                return mailServices[i].processMail(mail);

            }

            return mailServices[i].processMail(temp);

        }


        return realMailService.processMail(mail);
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }
}
