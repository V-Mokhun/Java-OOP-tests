package date;

public class TestImmutableDate {
	public static void main(String[] args) {
		ImmutableDate date = new ImmutableDate(2021, 1, 1);
		ImmutableDate date2 = new ImmutableDate(2022, 8, 8);
		System.out.println(date.toString());
		System.out.println(date2.toString());
		System.out.println("Equals: " + date.equals(date2));
		System.out.println("Hashcode 1: " + date.hashCode());
		System.out.println("Hashcode 2: " + date2.hashCode());
	}
}
