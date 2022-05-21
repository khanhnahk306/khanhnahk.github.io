import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            int val = nums[idx];
            if (val < 0) {
                integerArrayList.add(idx + 1);
            } else
                nums[idx] *= -1;
        }
        return integerArrayList;
    }
}
