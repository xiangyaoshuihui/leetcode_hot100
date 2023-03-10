import java.util.List;
import java.util.LinkedList;

//Definition for a binary tree node.
class TreeNode {
   int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}



public class easy_94 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }

    public static void mid(TreeNode now,List<Integer> result){
        if(now==null) return;
        mid(now.left,result);
        result.add(now.val);
        mid(now.right,result);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new LinkedList<Integer>();
        mid(root,result);
        return result;
    }
}
