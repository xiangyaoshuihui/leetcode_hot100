public class medium_5 {
    public static void main(String[] args){
        String s="cbbd";
        String result=longestPalindrome(s);
        System.out.println(result);
    }

    public static  String longestPalindrome(String s) {

        String result=s.substring(0,1);
        int[][] dp=new int[1000][1000];
        for(int i=0;i<s.length();i++){
            dp[i][i]=1;
        }
        for(int k=1;k<s.length();k++){
            for(int i=0;i<s.length()-k;i++){
                if(s.charAt(i)==s.charAt(i+k)){
                    if(k!=1){
                        if(dp[i+1][i+k-1]==1){
                            result=s.substring(i, i+k+1);
                            dp[i][i+k]=1;
                        }
                    }
                    else{
                        result=s.substring(i, i+k+1);
                        dp[i][i+k]=1;
                    }
                }
            }
        }

        return result;
    }
}