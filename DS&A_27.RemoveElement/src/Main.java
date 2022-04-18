import java.util.Arrays;

public class Main {
    public static int removeElement(int[] nums, int val) {
        int ele = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ele] = nums[i];
                ele++;
            }
        }
        return ele;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int result = removeElement(nums, val);
        System.out.println(result);
    }
}
