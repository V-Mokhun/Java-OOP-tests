package vacation;

public class FlightPlanner implements TravelPlanner {
	@Override
	public void planRoute(String destination) {
		System.out.println("Planning flight to " + destination);
	}
}
