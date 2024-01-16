package student;

public record StudentRecord(String name, String id, double gpa) {
	public StudentRecord {
		if(gpa < 0 || gpa > 4) throw new IllegalArgumentException("GPA must be between 0 and 4");

	}

	public boolean isHonorStudent() {
		return gpa >= 3.5;
	}

	public String printDetails() {
		return String.format("Name: %s, ID: %s, GPA: %.2f", name, id, gpa);
	}
}
