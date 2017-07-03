import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	Solution s = new Solution();
	@Test
	public void test() {
		assertNotNull(s);
	}

	@Test
	public void calculateTest(){
		assertTrue(1000 == s.calculate('m','d'));
		assertTrue(500 == s.calculate('d','d'));
		assertTrue(-500 == s.calculate('d','m'));
		assertTrue(100 == s.calculate('c','l'));
		assertTrue(-100 == s.calculate('c','d'));
		assertTrue(50 == s.calculate('L','i'));
		assertTrue(-50 == s.calculate('l','M'));
		assertTrue(10 == s.calculate('x','I'));
		assertTrue(-10 == s.calculate('X','d'));
		assertTrue(5 == s.calculate('v','I'));
		assertTrue(-5 == s.calculate('v','d'));
		assertTrue(1 == s.calculate('i','I'));
		assertTrue(-1 == s.calculate('i','d'));
	}
	
	@Test
	public void romanToIntTest(){
		assertTrue(2000 == s.romanToInt("mm"));
		assertTrue(900 == s.romanToInt("cm"));
		assertTrue(3586 == s.romanToInt("MMMDLXXXVI"));
	}
}
