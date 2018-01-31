package Exceptions;

public class NoDepositRecordException extends Exception {

	private static final long serialVersionUID = 7778761347539285891L;

	public NoDepositRecordException() {
	}

	public NoDepositRecordException(String message) {
		super(message);
	}

	public NoDepositRecordException(Throwable cause) {
		super(cause);
	}

	public NoDepositRecordException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoDepositRecordException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
