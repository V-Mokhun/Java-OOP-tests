package create;

public class ArrayCreator {
	public static <T> void createArray(T val1, T val2, T[] arr) {
		if(arr.length != 2) throw new IllegalArgumentException("Array must have length 2");
		arr[0] = val1;
		arr[1] = val2;
	}
}
