public class Main {
    public static void main(String[] args) {

    }

    private static TreeNode prev = null;

    public static boolean isValidBST(TreeNode root) {
        if (root == null){
            return true;
        }
        boolean leftSubTreeValid = isValidBST(root.left);
        if (!leftSubTreeValid){
            return false;
        }
        if (prev != null && root.val <= prev.val){
            return false;
        }
        prev = root;
        return isValidBST(root.right);
    }
}
