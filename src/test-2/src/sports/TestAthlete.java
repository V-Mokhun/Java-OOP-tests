package sports;

public class TestAthlete {
	public static void main(String[] args) {
		Athlete athlete = new Athlete("John", new double[]{10.5, 11.2, 9.8, 10.1, 10.9});
		try {
			Athlete clonedAthlete = athlete.clone();
			athlete.changeTime(2, 100);
			System.out.println(athlete);
			System.out.println(clonedAthlete);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
