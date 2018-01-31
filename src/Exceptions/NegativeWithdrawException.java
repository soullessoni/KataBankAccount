package Exceptions;

public class NegativeWithdrawException extends Exception {

	private static final long serialVersionUID = 286879540619085992L;

	public NegativeWithdrawException() {
	}

	public NegativeWithdrawException(String message) {
		super(message);
	}

	public NegativeWithdrawException(Throwable cause) {
		super(cause);
	}

	public NegativeWithdrawException(String message, Throwable cause) {
		super(message, cause);
	}

	public NegativeWithdrawException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
