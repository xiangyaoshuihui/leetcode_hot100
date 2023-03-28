import java.util.List;
import java.util.ArrayList;


//
public class medium_78 {
    public static void main(String[] args){
        System.out.println("helloworld");
        List<List<Integer>> result =new ArrayList<List<Integer>>();
        result=subsets(new int[]{1,2,3});
    
    }

    public static void func(int d,int n,int[]nums,List<List<Integer>> result,ArrayList<Integer> temp){
        if(d==n){
            ArrayList<Integer> ll=new ArrayList<>(temp);
            result.add(ll);
            return;
        }

        func(d+1,n,nums,result,temp);

        temp.add(nums[d]);
        func(d+1,n,nums,result,temp);
        temp.remove(temp.size()-1);

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result =new ArrayList<List<Integer>>();

        ArrayList<Integer> aa=new ArrayList<Integer>();
        func(0,nums.length,nums,result,aa);
        return result;
    }
}
