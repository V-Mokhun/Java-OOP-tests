package sports;

import java.util.Objects;

public class AthleteProfile {
	private String athleteName;
	private String sport;
	private Stadium stadium;

	public AthleteProfile(String athleteName, String sport, Stadium stadium) {
		this.athleteName = athleteName;
		this.sport = sport;
		this.stadium = stadium;
	}

	public String getAthleteName() {
		return athleteName;
	}

	public String getSport() {
		return sport;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	public String toString() {
		return "Athlete: " + athleteName + "\nSport: " + sport + "\nStadium: " + stadium.getName();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AthleteProfile that = (AthleteProfile) o;
		return Objects.equals(athleteName, that.athleteName) && Objects.equals(sport, that.sport) && Objects.equals(stadium, that.stadium);
	}

	@Override
	public int hashCode() {
		return Objects.hash(athleteName, sport, stadium);
	}
}
