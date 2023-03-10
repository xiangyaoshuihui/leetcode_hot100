import java.util.Stack;
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
}
