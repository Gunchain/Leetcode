import static org.junit.Assert.*;

import org.junit.Test;

public class Solution_0009Test {

	Solution_0009 s = new Solution_0009();
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertNotNull(s);
	}
	
	@Test
	public void testIsPalindrome(){
		assertTrue(s.isPalindrome(121));
		assertTrue(s.isPalindrome(1221));
		assertTrue(s.isPalindrome(1));
		assertTrue(s.isPalindrome(123));
		assertTrue(s.isPalindrome(Integer.MIN_VALUE));
		assertTrue(s.isPalindrome(Integer.MAX_VALUE));
	}

}
