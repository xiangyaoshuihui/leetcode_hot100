import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class a0_muban {
    public static void main(String[] args){

        List<Integer> l1=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        l1.add(1);
        result.add(l1);
        l1.add(2);
        result.add(l1);

        for(List<Integer> i:result){
            for(Integer j:i){
                System.out.println(j);
            }
        }
        System.out.println("helloworld");
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];
        

        return result;
    }
}