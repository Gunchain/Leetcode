import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	Solution s = new Solution();
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertNotNull(s);
	}
	
	@Test
	public void reverseTest(){
		System.out.println(s.reverse(-2147483648));
		//System.out.println( 0 - (long)(-2147483648) );
		assertTrue(123 == s.reverse(321));
		assertTrue(-123 == s.reverse(-321));
		assertTrue(2 == s.reverse(2));
		assertTrue(-3 == s.reverse(-3));
		assertTrue(223 == s.reverse(322));
		assertTrue(12222 == s.reverse(22221));
		
	}

}
