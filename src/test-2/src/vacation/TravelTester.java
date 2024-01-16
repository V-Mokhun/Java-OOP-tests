package vacation;

public class TravelTester {
	public static void main(String[] args) {
		RoadTripPlanner roadTripPlanner = new RoadTripPlanner();
		FlightPlanner flightPlanner = new FlightPlanner();

		roadTripPlanner.planRoute("New York");
		roadTripPlanner.cancelTrip();

		flightPlanner.planRoute("London");
		flightPlanner.cancelTrip();

		TravelPlanner.getTravelMode();
	}
}
