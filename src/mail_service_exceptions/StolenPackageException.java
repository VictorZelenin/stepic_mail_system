package mail_service_exceptions;

/**
 * Created by User on 25.01.2016.
 */
public class StolenPackageException extends RuntimeException {
    public StolenPackageException() {
        super();
    }

    public StolenPackageException(String message) {

        super(message);
    }

    public StolenPackageException(String message, Throwable cause) {
        super(message, cause);
    }
}
