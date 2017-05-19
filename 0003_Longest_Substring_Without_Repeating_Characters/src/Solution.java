
public class Solution {
	public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        return longestSubCharArray(ch, 0, ch.length);
    }
    
    public int longestSubCharArray(char[] ch, int f, int t){
        int len = 0;
        int max = len;
        for (int j = f; j < t;){
            len = 1;
            for (int i = j + 1; i < t; i ++){
                int e = checkExist(ch[i], ch, j, i);
                if (e == -1){
                    len ++;
                } else{
                    //j = e + 1;
                    break;
                }
            }
            if (len > max){
                max = len;
            }
            j += 1;
        }
        return max;
    }
    
    public int checkExist(char c, char[] ch, int f, int t){
        int e = -1;
        for (int i = f; i < t; i ++){
            if(c == ch[i]){
                e = i;
                return e;
            }
        }
        return e;
    }
}
