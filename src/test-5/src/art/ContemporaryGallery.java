package art;

import java.util.Objects;
public class ContemporaryGallery extends ArtGallery {
	private int numberOfInstallations;

	public ContemporaryGallery(String name, String city, int numberOfInstallations) {
		super(name, city);
		this.numberOfInstallations = numberOfInstallations;
	}

	public int getNumberOfInstallations() {
		return this.numberOfInstallations;
	}

	public void setNumberOfInstallations(int numberOfInstallations) {
		this.numberOfInstallations = numberOfInstallations;
	}

	@Override
	public String toString() {
		return "ArtGallery{" +
						"name='" + this.getName() + '\'' +
						", city='" + this.getCity() + '\'' +
						", paintings=" + this.getPaintings().toString() +
						", numberOfInstallations=" + this.numberOfInstallations +
						'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ContemporaryGallery that = (ContemporaryGallery) o;
		return Objects.equals(this.getName(), that.getName())
						&& Objects.equals(this.getCity(), that.getCity())
						&& Objects.equals(this.getPaintings(), that.getPaintings())
						&& Objects.equals(this.numberOfInstallations, that.getNumberOfInstallations());
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getName(), this.getCity(), this.getPaintings(), this.getNumberOfInstallations());
	}
}
