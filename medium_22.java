import java.util.List;
import java.util.ArrayList;

public class medium_22 {
    public static void main(String[] args){
        List<String> result=generateParenthesis(3);

        for(String i:result){
            System.out.println(i);
        }
        
    }

    //l:未匹配的左括号  ll:已使用的左括号
    public static void func(StringBuffer ss,int l,int ll,int n,List<String> result){
        if(ss.length()==n*2){
            result.add(ss.toString());
            return;
        }

        if(l==0){
            ss.append('(');
            l+=1;
            ll+=1;
            func(ss,l,ll,n,result);
            ss.deleteCharAt(ss.length()-1);
            l-=1;
            ll-=1;

        }
        else{
            if(ll==n){
                ss.append(')');
                l-=1;
                func(ss,l,ll,n,result);
                ss.deleteCharAt(ss.length()-1);
                l+=1;
            }
            else{
                ss.append('(');
                l+=1;
                ll+=1;
                func(ss,l,ll,n,result);
                ss.deleteCharAt(ss.length()-1);
                l-=1;
                ll-=1;

                ss.append(')');
                l-=1;
                func(ss,l,ll,n,result);
                ss.deleteCharAt(ss.length()-1);
                l+=1;

            }
        }
    }

    public static  List<String> generateParenthesis(int n){
        List<String> result=new ArrayList<String>();
        func(new StringBuffer(""),0,0,n,result);
        return result;
    }


    //官方题解
    public List<String> generateParenthesis2(int n) {
        StringBuilder sb=new StringBuilder();
        List<String> list=new ArrayList<>();
        insert(sb,list,n,n);
        return list;
    }
    public void insert(StringBuilder sb,List<String> list,int left,int right){
        if(left>right){return;}
        if(right==0&&left==0){list.add(sb.toString());return;}
        if(left>0){
            sb.append("(");
            insert(sb,list,left-1,right);
            sb.deleteCharAt(sb.length()-1);
        }
        if(right>0){
            sb.append(")");
            insert(sb,list,left,right-1);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
}