
public class Solution_0007 {

	public int reverse(int x) {
        if (x > -10 && x < 10){
        	return x;
        }
        boolean ne = false;
        if (x < 0 && x > Integer.MIN_VALUE){
        	x = 0 - x;
        	ne = true;
        }else if(x == Integer.MIN_VALUE){
        	return 0;
        }
        int re = 0;
		while(x >= 10){
        	re *= 10;
        	re += x % 10;
        	x /= 10;
        }
		if (re > Integer.MAX_VALUE / 10){
			return 0;
		}
		re = re * 10 + x;
		if (ne){
			re = 0 - re;
		}
		
		return re;
    }
}
