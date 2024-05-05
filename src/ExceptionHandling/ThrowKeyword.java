package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) { //method just to demo throw keyword

		String data = null;

		try {
			if (data == null) {
				throw new Exception("DATANOTFOUND");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
