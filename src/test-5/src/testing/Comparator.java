package testing;

public class Comparator {
	public static <T> void compareAndPrint(T a, T b) {
		if (a.equals(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}
}
