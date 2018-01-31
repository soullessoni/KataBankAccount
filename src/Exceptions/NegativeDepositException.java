package Exceptions;

public class NegativeDepositException extends Exception {

	private static final long serialVersionUID = -2496913802649120194L;

	public NegativeDepositException() {
	}

	public NegativeDepositException(String message) {
		super(message);
	}

	public NegativeDepositException(Throwable cause) {
		super(cause);
	}

	public NegativeDepositException(String message, Throwable cause) {
		super(message, cause);
	}

	public NegativeDepositException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
