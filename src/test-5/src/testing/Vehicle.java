package testing;

import java.util.Objects;

public class Vehicle {
	private String model;
	private int speed;

	public Vehicle(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Vehicle{" +
						"model='" + model + '\'' +
						", speed=" + speed +
						'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Vehicle vehicle = (Vehicle) o;
		return speed == vehicle.speed && Objects.equals(model, vehicle.model);
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, speed);
	}
}
