import static org.junit.Assert.*;

import org.junit.Test;

public class Solution_0006Test {
	Solution_0006 s = new Solution_0006();
	@Test
	public void test() {
//		fail("Not yet implemented");
		
		assertNotNull(s);
	}
	
	@Test
	public void convertTest(){
		String t = "0123456789";
//		System.out.println(s.convert(t, 2));
//		System.out.println(s.convert(t, 3));
//		System.out.println(s.convert(t, 4));
//		System.out.println(s.convert(t, 5));
		assertTrue(s.convert(t, 2).length() == t.length());
		assertTrue(s.convert(t, 3).length() == t.length());
		assertTrue(s.convert(t, 4).length() == t.length());
		assertTrue(s.convert(t, 5).length() == t.length());
		assertTrue(s.convert("A", 1).equals("A"));
		
	}
}
