
public class Sample {

	public static void main(String[] args) throws ArithmeticException {
		try {
			System.out.println(9 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
