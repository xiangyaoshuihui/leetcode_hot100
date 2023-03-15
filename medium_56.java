import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;


class sort1 implements Comparator<int[]> {
   @Override
   public int compare(int[] t1,int [] t2) {
       return t1[0]-t2[0];
   }

}


public class medium_56 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }


    public static int[][] merge(int[][] intervals) {
        int [][] result=new int[1000][2];

        Arrays.sort(intervals,new sort1());


        int no=0;
        int l=intervals[0][0],r=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=r){
                r=Math.max(r,intervals[i][1]);
            }
            else{
                result[no][0]=l;
                result[no][1]=r;
                no++;
                l=intervals[i][0];
                r=intervals[i][1];
            }
        }

        result[no][0]=l;
        result[no][1]=r;
        no++;

        int [][]result1=new int[no][2];
        for(int i=0;i<no;i++){
            result1[i]=result[i];
        }
        return result1;
    }

    //官方题解
        public int[][] merge11(int[][] intervals) {
            if (intervals.length == 0) {
                return new int[0][2];
            }
            Arrays.sort(intervals, new Comparator<int[]>() {
                public int compare(int[] interval1, int[] interval2) {
                    return interval1[0] - interval2[0];
                }
            });
            List<int[]> merged = new ArrayList<int[]>();
            for (int i = 0; i < intervals.length; ++i) {
                int L = intervals[i][0], R = intervals[i][1];
                if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                    merged.add(new int[]{L, R});
                } else {
                    merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
                }
            }
            return merged.toArray(new int[merged.size()][]);
        }

    

}
