
public class Solution_0013 {

	public int romanToInt(String s) {
        int re = 0;
		if (s.matches("[MmDdCcLlXxVvIi]+")){
        	char[] ch = s.toCharArray();
        	for (int i = 0 ; i < ch.length - 1; i ++){
        		re += calculate(ch[i], ch[i + 1]);
        	}
        	re += calculate(ch[ch.length - 1], ch[ch.length - 1]);
        }
		return re;
    }
	
	public int calculate(char c, char w){
		switch (c){
			case 'M':
			case 'm':
				return 1000;
			case 'D':
			case 'd':
				if (w != 'm' && w != 'M'){
					return 500;
				} else {
					return -500;
				}
			case 'C':
			case 'c':
				if ("MmDd".indexOf(w) == -1){
					return 100;
				} else {
					return -100;
				}
			case 'L':
			case 'l':
				if ("LlXxVvIi".indexOf(w) != -1){
					return 50;
				}else {
					return -50;
				}
			case 'X':
			case 'x':
				if ("XxVvIi".indexOf(w) != -1){
					return 10;
				} else {
					return -10;
				}
			case 'V':
			case 'v':
				if ("VvIi".indexOf(w) != -1){
					return 5;
				} else {
					return -5;
				}
			case 'I':
			case 'i':
				if (w == 'i' || w == 'I'){
					return 1;
				} else {
					return -1;
				}
		}
		return 0;	
	}
}
