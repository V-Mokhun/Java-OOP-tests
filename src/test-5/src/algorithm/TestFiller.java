package algorithm;

import java.util.Arrays;

public class TestFiller {
	public static void main(String[] args) {
		Integer[] array = new Integer[10];
		Filler.fillWithDefaultValue(array, 5);

		System.out.println(Arrays.toString(array));
	}
}
