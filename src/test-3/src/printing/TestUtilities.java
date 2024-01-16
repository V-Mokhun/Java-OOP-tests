package printing;

public class TestUtilities {
	public static void main(String[] args) {
		String[] array = {"a", "b", "c", "d", "e"};
		Integer[] array2 = {1, 2, 3, 4, 5};
		Double[] array3 = {31.2, 93.1, 1.2, 3.4, 5.6, 0.21};

		Utilities.printEverySecond(array);
		Utilities.printEverySecond(array2);
		Utilities.printEverySecond(array3);
	}
}
