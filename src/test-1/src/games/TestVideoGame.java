package games;

import java.util.Arrays;

public class TestVideoGame {
	public static void main(String[] args) {
		VideoGame[] arr = {new VideoGame("some name", "Developer 1", 1.0),
											 new VideoGame("short", "Developer 2", 2.0),
											 new VideoGame("very long long name", "Developer 3", 3.0),
											 new VideoGame("Doom", "Developer 4", 4.0),};

		System.out.println("Before sorting: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting: " + Arrays.toString(arr));
	}
}
