import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class medium_15 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int k=nums.length-1;
            for(int j=i+1;j<k;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                
                while(j<k&&nums[i]+nums[j]+nums[k]>0)k--;
                if(j>=k)break;
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> temp=new  ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                }
            }
        }

        return result;
    }
}
