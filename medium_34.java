public class medium_34 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }

    public static int[] searchRange(int[] nums, int target) {
        int [] result=new int[2];

        int l=0,r=nums.length-1;

        //左边界
        while(l<r){
            int m=(l+r)/2;
            if(nums[m]>=target)r=m;
            else l=m+1;
        }

        if(nums[l]!=target){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        result[0]=l;
        l=0;r=nums.length-1;

        //右边界
        while(l>r){
            int m=(l+r)/2+1;
            if(nums[m]>target)r=m-1;
            else l=m;
        }
        result[1]=l;





        return result;
    }
}
