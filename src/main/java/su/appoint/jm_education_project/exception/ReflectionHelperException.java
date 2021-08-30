package su.appoint.jm_education_project.exception;

public class ReflectionHelperException extends RuntimeException {

    public ReflectionHelperException() {
    }

    public ReflectionHelperException(String message) {
        super(message);
    }

    public ReflectionHelperException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReflectionHelperException(Throwable cause) {
        super(cause);
    }

    public ReflectionHelperException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
