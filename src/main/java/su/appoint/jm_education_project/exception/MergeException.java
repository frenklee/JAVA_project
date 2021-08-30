package su.appoint.jm_education_project.exception;

/**
 * An exception that occurs when fail attempt update a object.
 *
 * @author Evgeniya Kovtun
 * @see {@link education.web.platform.services.model.ReadWriteServiceImpl#update(Object)}
 */
public class MergeException extends RuntimeException {

	/**
	 * Constructor a MergeException using the given exception message.
	 *
	 * @param message The message explaining the reason for the exception.
	 */
	public MergeException(String message) {
		super(message);
	}

	/**
	 * Constructs a MergeException using the given message and underlying cause.
	 *
	 * @param message The message explaining the reason for the exception.
	 * @param cause   The underlying cause.
	 */
	public MergeException(String message, Throwable cause) {
		super(message, cause);
	}
}
