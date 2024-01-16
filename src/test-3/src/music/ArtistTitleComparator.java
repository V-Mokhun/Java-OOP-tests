package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
	@Override
	public int compare(Song o1, Song o2) {
		int artistCompare = o1.getArtist().compareTo(o2.getArtist());
		if (artistCompare != 0) {
			return artistCompare;
		}
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
