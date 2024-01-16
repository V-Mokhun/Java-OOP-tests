package utilities;

import java.util.ArrayList;

public class Appender {
	public static <E> void appendFromEnd(ArrayList<? super E> destination, ArrayList<? extends E> source) {
		for (int i = source.size() - 1; i >= 0; i--) {
			destination.add(source.get(i));
		}
	}
}
