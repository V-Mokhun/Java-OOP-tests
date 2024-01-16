package vacation;

public class RoadTripPlanner implements TravelPlanner {
	@Override
	public void planRoute(String destination) {
		System.out.println("Planning route to " + destination);
	}
}
