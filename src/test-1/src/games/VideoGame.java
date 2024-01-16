package games;

public class VideoGame implements Comparable<VideoGame> {
	private String name;
	private String developer;
	private double rating;

	public VideoGame(String name, String developer, double rating) {
		this.name = (name == null || name.isEmpty()) ? "" : name;
		this.developer = (developer == null || developer.isEmpty()) ? "" : developer;
		this.rating = (rating < 0) ? 0 : rating;
	}

	@Override
	public int compareTo(VideoGame that) {
		return that.name.length() - this.name.length();
	}

	@Override
	public String toString() {
		return "VideoGame{" +
						"name='" + name + '\'' +
						", developer='" + developer + '\'' +
						", rating=" + rating +
						'}';
	}
}
