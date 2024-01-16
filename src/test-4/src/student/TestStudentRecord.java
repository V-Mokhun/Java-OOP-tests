package student;

public class TestStudentRecord {
	public static void main(String[] args) {
		StudentRecord student = new StudentRecord("John Doe", "123456789", 3.21);
		StudentRecord student2 = new StudentRecord("Jane Doe", "987654321", 4.0);
		System.out.println(student.printDetails());
		System.out.println(student2.printDetails());
		System.out.println("First student is honor student: " + student.isHonorStudent());
		System.out.println("Second student is honor student: " + student2.isHonorStudent());
	}
}
