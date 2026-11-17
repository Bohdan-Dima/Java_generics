package Work;

public class Box<K, V, F> {
	private K key;
	private V value;
	private F numbers;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public F getNumbers() {
		return numbers;
	}
	public void setNumbers(F numbers) {
		this.numbers = numbers;
	}
	public Box(K key, V value, F numbers) {
		super();
		this.key = key;
		this.value = value;
		this.numbers = numbers;
	}
	
	

}
