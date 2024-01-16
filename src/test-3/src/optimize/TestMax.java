package optimize;

public class TestMax {
	public static void main(String[] args) {
		System.out.println(Max.findMax(1, 2, 3));
		System.out.println(Max.findMax(1.1, 2.2, 3.3));

		System.out.println(Max.findMax("a", "b", "c"));
		System.out.println(Max.findMax("abc", "ab", "a"));
	}
}
