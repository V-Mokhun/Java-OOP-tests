package pair;

public class Pair <K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getFirst() { return key; }
	public V getSecond() { return value; }

	public void setKey(K key) { this.key = key; }
	public void setValue(V value) { this.value = value; }

	public String toString() {
		return "(" + key + ", " + value + ")";
	}
}
