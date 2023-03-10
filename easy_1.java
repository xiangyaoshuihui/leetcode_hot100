import java.util.HashMap;
import java.util.Map;


public class easy_1 {
    public static void main(String[] args){
        int [] a=new int[]{3,2,4};
        int []c={1,1,11,1};
        int tar=6;
        int []zz=twoSum(a,tar);
        System.out.println(zz[0]+" "+zz[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];
        Map<Integer,Integer> m=new HashMap<>();
        m.clear();
        for(Integer i:nums){
            
            if(m.containsKey(i)){
                Integer t1=m.get(i)+1;
                m.remove(i);
                m.put(i,t1);
            }
            else{
                m.put(i,1);
            }
        }
        int z1=0,z2=0;
        for(Integer i:nums){
            if(m.containsKey(target-i)){
                if((target-i)!=i){
                    z1=i;
                    z2=target-i;
                    break;
                }
                else if(m.get(i)==2){
                    z1=i;
                    z2=target-i;
                    break;
                }
            }
        }

        boolean f=true;
        int pla=0;
        for(Integer i:nums){
            if(f){
                if(i==z1){
                    result[0]=pla;
                    f=false;
                }
            }
            else{
                if(i==z2){
                    result[1]=pla;
                    break;
                }
            }
            pla++;
        }
        return result;
    }

    //官方题解
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

}