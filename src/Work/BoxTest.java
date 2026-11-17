package Work;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BoxTest {

	@Test
	public void textBox() {
		Box<String, Integer, Float> box1 = new Box<>("String", 2, 3.5f);
		Box<String, Integer, Float> box2 = new Box<>("String", 5, 6.5f);

		Float result = box1.getValue() + box2.getValue()+box1.getNumbers()+box2.getNumbers();

		int expented = 17;
		assertEquals(expented, result);

	}

}
