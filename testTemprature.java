import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testTemprature {

	@Test
	void test() {
		Temprature temp = new Temprature();
		double expect=82.4;
		double expect1=27.77777777777778;
		double actual=temp.celToFar(28);
		double actual1=temp.farToCel(82);
		assertEquals(actual,expect);
		assertEquals(actual1,expect1);
	}

}
