package music;

import java.util.*;

public class TestSong {
	public static void main(String[] args) {
		List<Song> arr = Arrays.asList(
						new Song("Some Song", "Some Artist", 54),
						new Song("Another Song", "Another Artist", 92),
						new Song("Yet Another Song", "Yet Another Artist", 54),
						new Song("The Song", "The Artist", 42)
		);

		arr.sort(new DurationComparator().thenComparing(new ArtistTitleComparator()));
		System.out.println(arr);
	}
}
