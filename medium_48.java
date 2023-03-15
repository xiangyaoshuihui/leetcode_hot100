public class medium_48 {
    public static void main(String[] args){
        int [][]matrix=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int []i:matrix){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        System.out.println("helloworld");
    }

    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int k=0;k<n/2;k++){
            for(int i=0;i<n-k*2-1;i++){
                int len=n-2*k;
                int temp=matrix[k][i+k];
                matrix[k][i+k]=matrix[len-1-i+k][k];
                matrix[len-1-i+k][k]=matrix[len-1+k][len-1-i+k];
                matrix[len-1+k][len-1-i+k]=matrix[i+k][len-1+k];
                matrix[i+k][len-1+k]=temp;
            } 
        }
    }
}
