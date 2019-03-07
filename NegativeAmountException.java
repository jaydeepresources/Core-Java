package custom;

public class NegativeAmountException extends Exception {

	public NegativeAmountException() {

	}

	public NegativeAmountException(String errorMsg) {
		super(errorMsg);
	}

	@Override
	public void printStackTrace() {
		System.out.println("Printing the stack trace");
		super.printStackTrace();
	}

	public void printException() {
		System.out.println("The exception was caused by negative amount");
	}

}
