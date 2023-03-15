import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class medium_39 {
    public static void main(String[] args){
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        result=combinationSum(new int[]{2,3,5},8);
        for(List<Integer> i:result){
            for(Integer j:i){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        System.out.println("helloworld");
    }


    public static void dfs(ArrayList<Integer> temp,int sum,int target,int sta,List<List<Integer>> result,int[] candidates){
        if(sum>target){return;}
        else if(sum==target){
            List<Integer> temp1=new ArrayList<>();
            temp1.addAll(temp);
            result.add(temp1);
            return;
        }

        for(int i=sta;i<candidates.length;i++){
            if(sum+candidates[i]<=target){
                temp.add(candidates[i]);
                sum+=candidates[i];
                dfs(temp,sum,target,i,result,candidates);
                sum-=candidates[i];
                temp.remove(temp.size()-1);
            }
            else{
                break;
            }
        }

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
            ArrayList<Integer> temp=new ArrayList<>();
            dfs(temp,0,target,0,result,candidates);

        return result;
    }
}
