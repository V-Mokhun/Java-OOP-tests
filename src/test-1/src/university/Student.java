package university;

public class Student implements Comparable<Student> {
	private String name;
	private float grade;

	public Student(String name, float grade) {
		this.name = (name == null || name.isEmpty()) ? "" : name;
		this.grade = (grade < 0) ? 0 : grade;
	}

	@Override
	public String toString() {
		return "Student{" +
						"name='" + name + '\'' +
						", grade=" + grade +
						'}';
	}

	@Override
	public int compareTo(Student o) {
		return (int) (this.grade - o.grade);
	}
}
