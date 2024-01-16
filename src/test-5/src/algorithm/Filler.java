package algorithm;

public class Filler {
	public static <T> void fillWithDefaultValue(T[] array, T value) {
		if(array == null) {
			throw new IllegalArgumentException("Array cannot be null");
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = value;
		}
	}
}
