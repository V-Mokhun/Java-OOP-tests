package sports;

import java.util.Objects;

public class Stadium {
	private String name;
	private String location;
	private int capacity;
	private String homeTeam;

	public Stadium(String name, String location, int capacity, String homeTeam) {
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.homeTeam = homeTeam;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String toString() {
		return "Stadium: " + name + "\nLocation: " + location + "\nCapacity: " + capacity + "\nHome Team: " + homeTeam;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Stadium stadium = (Stadium) o;
		return capacity == stadium.capacity && Objects.equals(name, stadium.name) && Objects.equals(location, stadium.location) && Objects.equals(homeTeam, stadium.homeTeam);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, location, capacity, homeTeam);
	}
}
