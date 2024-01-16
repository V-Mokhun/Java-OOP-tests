package art;

import java.util.ArrayList;
import java.util.Objects;

public class ArtGallery {
	private String name;
	private String city;
	private ArrayList<String> paintings;

	public ArtGallery(String name, String city) {
		this.name = name;
		this.city = city;
		this.paintings = new ArrayList<String>();
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	public ArrayList<String> getPaintings() {
		return new ArrayList<>(this.paintings);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPaintings(ArrayList<String> paintings) {
		this.paintings = paintings;
	}

	@Override
	public String toString() {
		return "ArtGallery{" +
						"name='" + name + '\'' +
						", city='" + city + '\'' +
						", paintings=" + paintings.toString() +
						'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ArtGallery that = (ArtGallery) o;
		return Objects.equals(name, that.name) && Objects.equals(city, that.city) && Objects.equals(paintings, that.paintings);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, city, paintings);
	}

	public void addPainting(String painting) {
		this.paintings.add(painting);
	}

	public void removePainting(String painting) {
		this.paintings.remove(painting);
	}
}
