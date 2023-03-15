public class medium_55 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }

    public static boolean canJump(int[] nums) {
        boolean result=true;
        int now=0;

        for(int i=0;i<nums.length;i++){
            if(now>=i){
                now=Math.max(i+nums[i],now);
            }
            else{
                result=false;
                break;
            }
        }
        

        return result;
    }
    
}
