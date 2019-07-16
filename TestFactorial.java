import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactorial {

	@Test
	void test() {
		Factorial fac = new Factorial();
		int actual = fac.fact(6);
		int expect=720;
		
		assertEquals(actual,expect);
	}

}
