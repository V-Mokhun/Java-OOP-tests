package algorithm;

public class TestCompare {
	public static void main(String[] args) {
		System.out.println(Compare.compareThree(1, 1, 1));
		System.out.println(Compare.compareThree(1, 2, 1));

		System.out.println(Compare.compareThree("a", "a", "a"));
		System.out.println(Compare.compareThree("a", "a", "b"));
		System.out.println(Compare.compareThree("b", "a", "a"));
	}
}
