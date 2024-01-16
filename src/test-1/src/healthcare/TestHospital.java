package healthcare;

public class TestHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital("Hospital 1", 100);
		System.out.println(hospital);
		try {
			Hospital clone = (Hospital) hospital.clone();
			System.out.println(clone);
			clone.setName("Hospital 2");
			System.out.println("Original: " + hospital);
			System.out.println("Clone: " + clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
