public class hard_312 {
    public static void main(String[] args){
        int zz=maxCoins(new int[]{3,1,5,8});
        System.out.println(zz);
    }


    //区间dp
    public static int maxCoins(int[] nums) {
        int result=0;

        int n=nums.length;
        int [][]dp=new int[n+2][n+2];
        int[] zz=new int[n+2];

        zz[0]=1;
        zz[n+1]=1;
        for(int i=1;i<=n;i++){
            zz[i]=nums[i-1];
        }


        for(int k=2;k<=n+1;k++){
            for(int i=0;i<=n+1-k;i++){
                int j=i+k;

                int res=0;
                for(int p=i+1;p<=j-1;p++){
                    res=Math.max(res,dp[i][p]+dp[p][j]+zz[i]*zz[p]*zz[j]);
                }
                dp[i][j]=res;
            }
        }

        return dp[0][n+1];
    }
}
