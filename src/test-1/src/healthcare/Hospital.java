package healthcare;

public class Hospital implements Cloneable {
	private String name;
	private double capacity;

	public Hospital(String name, double capacity) {
		this.name = (name == null || name.isEmpty()) ? "" : name;
		this.capacity = (capacity < 0) ? 50 : capacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Hospital{" +
						"name='" + name + '\'' +
						", capacity=" + capacity +
						'}';
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Hospital clone = (Hospital) super.clone();
		clone.name = this.name;
		clone.capacity = this.capacity;
		return clone;
	}
}
