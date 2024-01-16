package printing;

public class Utilities {
	public static <T> void printEverySecond(T[] array) {
		if(array == null) {
			throw new IllegalArgumentException("Array cannot be null");
		}

		for(int i = 1; i < array.length; i += 2) {
			System.out.println(array[i]);
		}
	}
}
