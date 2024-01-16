package vacation;

public interface TravelPlanner {
	void planRoute(String destination);
	default void cancelTrip() {
		System.out.println("Trip cancelled");
	}
	static void getTravelMode() {
		System.out.println("Travel Mode");
	}
}
