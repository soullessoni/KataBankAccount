package Exceptions;

public class NegativeCreationException extends Exception {
	
	private static final long serialVersionUID = -3059953546214828776L;

	public NegativeCreationException() {
	}

	public NegativeCreationException(String message) {
		super(message);
	}

	public NegativeCreationException(Throwable cause) {
		super(cause);
	}

	public NegativeCreationException(String message, Throwable cause) {
		super(message, cause);
	}

	public NegativeCreationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
