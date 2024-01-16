package testing;

public class TestComparator {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Tesla Model S", 250);
		Vehicle vehicle2 = new Vehicle("Tesla Model S", 250);
		Vehicle vehicle3 = new Vehicle("Tesla Model 3", 220);

		Comparator.compareAndPrint(vehicle1, vehicle2);
		Comparator.compareAndPrint(vehicle1, vehicle3);
		Comparator.compareAndPrint(vehicle2, vehicle3);
	}
}
