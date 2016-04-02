package mail_service;

import Sendable.Sendable;

/**
 * Created by User on 25.01.2016.
 */
@FunctionalInterface
public interface MailService {
    Sendable processMail(Sendable mail);
}
