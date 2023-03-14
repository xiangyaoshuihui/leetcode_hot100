import java.util.Arrays;

public class medium_31 {
    public static void main(String[] args){
        System.out.println("helloworld");
        nextPermutation(new int[]{1,3,2});
    }

    public static void nextPermutation(int[] nums) {

        int l=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                for(int j=nums.length-1;j>=i+1;j--){
                    if(nums[j]>nums[i]){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                }
                l=i+1;
                break;
            }
        }


        // for(int i=l;i<nums.length-1;i++){
        //     int k=i;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[k]>nums[j])k=j;
        //     }
        //     int temp=nums[k];
        //     nums[k]=nums[i];
        //     nums[i]=temp;
        // }


        //不用排序，直接reverse就行，因为i+1后面的数组是倒序的
        int r = nums.length - 1;
        while (l <= r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
        

    }
    
}
