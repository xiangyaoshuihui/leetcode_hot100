import java.util.LinkedList;
import java.util.List;
import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class medium_17 {
    public static void main(String[] args) {
        List<String> ssz = letterCombinations("23");

        for (String i : ssz) {
            System.out.println(i);
        }

    }

    public static void func(String digits, List<String> result, Map<Character, String> m, String ss) {
        if (ss.length() == digits.length()) {
            if(ss.length()>0)result.add(ss);
            return;
        }

        Character cc = digits.charAt(ss.length());
        String s1 = m.get(cc);

        for (int i = 0; i < s1.length(); i++) {
            ss = ss + s1.charAt(i);
            func(digits, result, m, ss);
            ss = ss.substring(0, ss.length() - 1);
        }

    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Character, String> m = new HashMap<>();
        m.put('2', "abc");
        m.put('3', "def");
        m.put('4', "ghi");
        m.put('5', "jkl");
        m.put('6', "mno");
        m.put('7', "pqrs");
        m.put('8', "tuv");
        m.put('9', "wxyz");

        func(digits, result, m, "");

        return result;
    }


    //官方解法
    List<String> list = new ArrayList<>();
    public List<String> letterCombinations2(String digits) {
        if(digits==null||digits.length()==0){ return list;}
        String [] numString = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backTracking(digits,numString,0);
        return list;
    }
    StringBuffer temp = new StringBuffer();
    public void backTracking(String digits,String[] numString,int num){
        if(num ==digits.length()){
            list.add(temp.toString());
            return;
        }
        String str =numString[digits.charAt(num)-'0'];
        for(int i=0;i<str.length();i++){
            temp.append(str.charAt(i));
            backTracking(digits,numString,num+1);
            temp.deleteCharAt(temp.length()-1);
        }

    }
}
