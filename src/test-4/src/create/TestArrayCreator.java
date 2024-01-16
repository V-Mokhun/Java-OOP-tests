package create;

public class TestArrayCreator {
	public static void main(String[] args) {
		String[] arr = new String[2];
		ArrayCreator.createArray("Hello", "World", arr);
		System.out.println(arr[0] + " " + arr[1]);

		Integer[] arr2 = new Integer[2];
		ArrayCreator.createArray(1, 2, arr2);
		System.out.println(arr2[0] + " " + arr2[1]);

		try {
			ArrayCreator.createArray(1, 2, new Integer[3]);
		} catch(IllegalArgumentException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}
}
