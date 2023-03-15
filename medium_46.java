import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class medium_46 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }


    public static void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public static void dfs(int len,List<List<Integer>> result,int[] nums){
        if(len==nums.length-1){
            List<Integer> zz=new ArrayList<Integer>();
            for(int i:nums){
                zz.add(i);
            }
            result.add(zz);
            return;
        }
        for(int i=len;i<nums.length;i++){
            swap(nums,len,i);
            dfs(len+1,result,nums);
            swap(nums,len,i);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        dfs(0,result,nums);
        return result;
    }
}
