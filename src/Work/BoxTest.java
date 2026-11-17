package Work;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BoxTest {

	@Test
	public void textBox() {
		Box<String, Integer> box1 = new Box("String", 10);
		Box<String, Integer> box2 = new Box("String", 20);
		box1.setValue(15);
		box2.setValue(8);
		int result = box1.getValue() + box2.getValue();

		int expented = 23;
		assertEquals(expented, result);

	}

}
