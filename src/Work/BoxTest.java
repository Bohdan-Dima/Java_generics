package Work;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BoxTest {

	@Test
	public void textBox() {
		Box<Integer> box = new Box<>(5, 10, 15);
		Box<Integer> box2 = new Box<>(5, 10, 15);
		assertEquals(0, box.compare(box2));
	}

}
