import java.util.Arrays;

public class medium_53 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }

    public static int maxSubArray(int[] nums) {
        int result=nums[0];
        int []dp=new int[nums.length];
        dp[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            if(dp[i-1]>0){
                dp[i]=dp[i-1]+nums[i];
            }
            else dp[i]=nums[i];
            result=Math.max(result,dp[i]);
        }

        return result;
    }
}
