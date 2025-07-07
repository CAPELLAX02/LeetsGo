import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean res = containsDuplicate(nums);
        System.out.println(res); // true
        boolean res2 = containsDuplicateBruteForce(nums);
        System.out.println(res2); // true

        int[] nums2 = {1, 2, 3, 4};
        boolean res3 = containsDuplicate(nums2);
        System.out.println(res3); // false
        boolean res4 = containsDuplicateBruteForce(nums2);
        System.out.println(res4); // false
    }
    static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
