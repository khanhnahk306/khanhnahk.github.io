public class Main {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    public static int pivotIndex(int[] nums) {
        int S = 0;
        for (int i = 0; i < nums.length; i++) {
            S += nums[i];
        }
        int ls = 0, rs = S;
        for (int i = 0; i < nums.length; i++) {
            rs = rs - nums[i];
            if (rs == ls) {
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
}
