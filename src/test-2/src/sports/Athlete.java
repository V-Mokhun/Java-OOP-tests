package sports;

import java.util.Arrays;

public class Athlete implements Cloneable{
	private String name;
	private double[] times;

	public Athlete(String name, double[] times) {
		this.name = name;
		this.times = times;
	}

	public void changeTime(int index, double newTime) {
		if(index < 0 || index >= times.length) {
			throw new IllegalArgumentException("Invalid index");
		}

		times[index] = newTime;
	}

	@Override
	public String toString() {
		return "Athlete{" +
						"name='" + name + '\'' +
						", times=" + Arrays.toString(times) +
						'}';
	}

	@Override
	protected Athlete clone() throws CloneNotSupportedException {
		Athlete clonedAthlete = (Athlete) super.clone();
		clonedAthlete.name = this.name;
		double[] clonedTimes = new double[this.times.length];
		for (int i = 0; i < this.times.length; i++) {
			clonedTimes[i] = this.times[i];
		}
		clonedAthlete.times = clonedTimes;
		return clonedAthlete;
	}
}
