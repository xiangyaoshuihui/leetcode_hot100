import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class hard_301 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }

    public static List<String> removeInvalidParentheses(String s) {
        List<String> result=new ArrayList<>();


        int n=s.length();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!=0){
                if(s.charAt(i)=='(')a[i]=a[i-1]+1;
                else if(s.charAt(i)==')')a[i]=a[i-1]-1;
                else a[i]=a[i-1];
            }
            else {
                if(s.charAt(i)=='(')a[i]=1;
                else if(s.charAt(i)==')')a[i]=-1;
                else a[i]=0;
            }
        }

        int de[][]=new int[10][2];
        int no=0;


        //int last=0;
        int l=0;
        int f=0;
        for(int i=0;i<n;i++){
            if(f==1){
                if(a[i]>a[i-1]){
                    de[no][0]=l;
                    de[no][1]=i-1;
                    no++;
                    f=0;
                    l=i;
                }
            }
            else if(a[i]<a[l]||i==0&&a[i]<0){
                f=1;
            }
        }



        //
        int ri[]=new int[2];
        int if_ri=0;
        if(f==1){
            de[no][0]=l;
            de[no][1]=n-1;
            no++;
        }
        else{
            if(l==0){
                if_ri=a[n-1];
            }
            else{
                if_ri=a[n-1]-a[l-1];
            }
            ri[0]=l;ri[1]=n-1;
        }


        List<List<StringBuffer>> llo=new ArrayList<List<StringBuffer>>();
        for(int i=0;i<no;i++){
            int l1=de[i][0];
            int r1=de[i][1];
            StringBuffer sb=new StringBuffer(s.substring(l1, r1+1));
            int num=0;
            if(de[i][0]==0){
                num=0-a[r1];
            }
            else num=a[l1-1]-a[r1];

            int []zz=new int[50];
            int zz_len=0;
            for(int j=l1;j<=r1;j++){
                if(s.charAt(j)==')')zz[zz_len++]=j-l1;
            }

            List<StringBuffer> re=new ArrayList<>();
            List<Integer> temp=new ArrayList<>();
            dfs(num,zz_len,0,temp,zz,sb,re);
            llo.add(re);
        }

        if(if_ri>0){
            
        }
        return result;
    }

    public static void dfs(int num,int n,int now,List<Integer> temp,int[] zz,StringBuffer sb,List<StringBuffer> re){
        if(num==0){
            StringBuffer zz1=new StringBuffer(sb);
            for(int i=0;i<temp.size();i++){
                zz1.deleteCharAt(i);
            }
            re.add(zz1);
            return;
        }
        if(n-now<num){
            return;
        }

        dfs(num,n,now+1,temp,zz,sb,re);

        temp.add(zz[now]);
        dfs(num-1,n,now+1,temp,zz,sb,re);
        temp.remove(temp.size()-1);
    }
}
