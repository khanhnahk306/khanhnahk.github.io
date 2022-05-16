public class Main {
    public static void main(String[] args) {

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        targetSum -= root.val;
        if (root.left == null && root.right == null) {
            if (0 == targetSum) return true;
            else return false;
        }
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
