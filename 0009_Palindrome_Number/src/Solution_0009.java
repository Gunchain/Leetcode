
public class Solution_0009 {

	public boolean isPalindrome(int x) {
		String s = String.valueOf(x);
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length / 2; i ++){
        	if (ch[i] != ch[ch.length-1-i]){
        		return false;
        	}
        }
        return true;
    }
}
