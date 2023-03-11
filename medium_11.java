
public class medium_11 {
    public static void main(String[] args){
        int zz=maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(zz);
    }

    public static int maxArea(int[] height) {
        int result=0;
        int []l=new int[height.length];
        int []r=new int[height.length];

        int max=-1;
        int l_size=0,r_size=0;
        for(int i=0;i<height.length;i++){
            if(height[i]>max){
                max=height[i];
                l[l_size++]=i;
            }
        }
        max=-1;
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>max){
                max=height[i];
                r[r_size++]=i;
            }
        }

        for(int i=0;i<l_size;i++){
            for(int j=0;j<r_size;j++){
                if(l[i]>=r[j]){
                    break;
                }
                int temp=(r[j]-l[i])*(height[r[j]]<height[l[i]]?height[r[j]]:height[l[i]]);
                if(temp>result){
                    result=temp;
                }
            }
        }
        

        return result;
    }

    //官方题解，双指针
    public static int maxArea2(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }


}
