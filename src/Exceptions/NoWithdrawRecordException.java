package Exceptions;

public class NoWithdrawRecordException extends Exception {

	private static final long serialVersionUID = -3358067731069714199L;

	public NoWithdrawRecordException() {
	}

	public NoWithdrawRecordException(String message) {
		super(message);
	}

	public NoWithdrawRecordException(Throwable cause) {
		super(cause);
	}

	public NoWithdrawRecordException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoWithdrawRecordException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
