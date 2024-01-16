package printing;

public class TestLogger {
	public static void main(String[] args) {
		Logger.logPair("Hello", "World");
		Logger.logPair(1, 2);
		Logger.logPair(1.0, 2.0);
		Logger.logPair(true, false);
	}
}
