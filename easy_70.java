

public class easy_70 {
    public static void main(String[] args){
        System.out.println(climbStairs(3));
    }

    public static  int climbStairs(int n){
        int []dp=new int[50];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-2]+dp[i-1];
        }
        

        return dp[n];
    }
}
