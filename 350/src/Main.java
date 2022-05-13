import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a = 0;
        int b = 0;
        List<Integer> list = new ArrayList<>();
        while (a < nums1.length && b < nums2.length) {
            if (nums1[a] < nums2[b]) {
                a++;
            } else if (nums1[a] > nums2[b]) {
                b++;
            } else {
                list.add(nums1[a]);
                a++;
                b++;
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (int n : list)
            result[i++] = n;
        return result;
    }
}
