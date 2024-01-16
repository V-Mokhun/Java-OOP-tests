package utilities;

import java.util.ArrayList;

public class TestAppender {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list2.add(3);
		list2.add(4);
		Appender.appendFromEnd(list1, list2);
		System.out.println(list1);
	}
}
