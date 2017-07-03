
public class Solution_0006 {

	public String convert(String s, int numRows) {
        String re = "";
        int z = numRows * 2 - 2;
        if (s.length() == 1 || z == 0){
        	return s;
        }
		for (int i = 0; i < s.length(); i = i + z){
        	re += s.charAt(i);
        }
		for (int i = 1; i < numRows; i ++){
			for (int j = 1; j < s.length() ; j ++){
				if (j % z == i || j % z == z - i)
					re += s.charAt(j); 
			}
		}
		return re;
    }
}
