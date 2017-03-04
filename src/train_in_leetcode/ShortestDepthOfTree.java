package train_in_leetcode;

/**
 * Created by ZhangJing on 2017/2/28.
 *
 *
 * 找到树的最小深度
 */
public class ShortestDepthOfTree {

    public static int run(TreeNode root) {
        int result = 0;
        if(root == null){
            return  result;
        }else{
            if(root.left == null && root.right == null){
                return 1;
            }else if (root.left == null){
                return run(root.right) + 1;
            }else if (root.right == null){
                return run(root.left) + 1;
            }else {
                return Math.min(run(root.left), run(root.right)) + 1;
            }
        }

    }

    public static  void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        System.out.println(run(root));

    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x; }
}






