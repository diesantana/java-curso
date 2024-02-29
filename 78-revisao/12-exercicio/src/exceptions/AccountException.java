package exceptions;

public class AccountException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AccountException() {
		super("An exception of type AccountException has occurred");
	}

	public AccountException(String message) {
		super(message);
	}
}
