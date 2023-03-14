public class medium_33 {
    public static void main(String[] args){
        int zz=search(new int[]{1,2,3,4,5}, 6);
        System.out.println(zz);
    }

    //l>=k -> l-k   l<k -> l+(nums.length-k) 
    public static int search(int[] nums, int target) {


        int l=0,r=nums.length-1;
        while(l<r){
            int m=(l+r)/2+1;
            if(nums[m]<nums[0])r=m-1;
            else l=m;
        }

        int k=nums.length-l-1;

        l=0;r=nums.length-1;
        while(l<r){
            int m=(l+r)/2;

            int conv=0;
            if(m>=k){
                conv=m-k;
            }
            else conv=m+(nums.length-k);

            if(nums[conv]>=target)r=m;
            else l=m+1;
        }

        int conv=0;
        if(l>=k){
            conv=l-k;
        }
        else conv=l+(nums.length-k);

        if(nums[conv]!=target)return -1;
        else return  conv;
    }
}
