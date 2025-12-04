package activities;

class CustomException extends Exception {
	private String message = null;

	public CustomException(String msg) {
		this.message = msg;
	}

	@Override
	public String getMessage() {
		return message;
	}

}

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			exceptionTest("Dummy string is provided");
			exceptionTest(null); // It will  throw the exception and exit the try catch block
		} catch (CustomException e) {
			System.out.println("Inside catch block: " + e.getMessage());
		}

	}

	public static void exceptionTest(String str) throws CustomException {
		if (str == null) {
			throw new CustomException("String is null");
		} else {
			System.out.println("String value is : " + str);
		}
	}

}
