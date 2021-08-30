package su.appoint.jm_education_project.exception;

/**
 * Exception used to indicate a problem with adding a object to DataBase.
 *
 * @author Evgeniya Kovtun
 * @see {@link education.web.platform.services.model.ReadWriteServiceImpl#persist(Object)}
 */
public class PersistException extends RuntimeException {

	/**
	 * Constructor a PersistException using the given exception message.
	 *
	 * @param message The message explaining the reason for the exception.
	 */
	public PersistException(String message) {
		super(message);
	}

	/**
	 * Constructs a PersistException using the given message and underlying cause.
	 *
	 * @param message The message explaining the reason for the exception.
	 * @param cause   The underlying cause.
	 */
	public PersistException(String message, Throwable cause) {
		super(message, cause);
	}
}
