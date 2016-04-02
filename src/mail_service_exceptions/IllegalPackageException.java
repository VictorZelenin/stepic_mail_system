package mail_service_exceptions;

/**
 * Created by User on 25.01.2016.
 */
public class IllegalPackageException extends RuntimeException {

    public IllegalPackageException() {
        super();
    }

    public IllegalPackageException(String message) {

        super(message);
    }

    public IllegalPackageException(String message, Throwable cause) {
        super(message, cause);
    }

}