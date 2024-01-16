package university;

public class TestStudent {
	public static void main(String[] args) {
		Student[] arr = {new Student("John", 9.21f),
										 new Student("Jane", 8.32f),
										 new Student("Jack", 13.85f),
										 new Student("Jill", 11.93f),};

		System.out.println("Median is: " + Median.findMedian(arr));
	}
}
