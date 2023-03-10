import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class medium_3 {
    public static void main(String[] args) {
        String ss = "tmmzuxt";
        int result = lengthOfLongestSubstring(ss);
        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<>();
        int result = 0;

        int sta = 0;
        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                int temp = m.get(s.charAt(i));
                
                for(int j=sta;j<=temp;j++){
                    m.remove(s.charAt(j));
                }
                m.put(s.charAt(i), i);
                sta = temp + 1;
            } else {
                m.put(s.charAt(i), i);
                result = (i - sta + 1) > result ? (i - sta + 1) : result;
            }
        }
        return result;
    }

}
