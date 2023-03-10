import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.LinkedList;


public class easy_20 {
    public static void main(String[] args){

        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        boolean result=true;
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    result=false;
                    break;
                }
                else if(s.charAt(i)==')'&&stack.peek()=='('||s.charAt(i)==']'&&stack.peek()=='['||s.charAt(i)=='}'&&stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    result =false;
                    break;
                }
            }

        }

        if(!stack.isEmpty()){
            return false;
        }
        return result;
    }

    //官方题解
    public boolean isValid2(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

}
