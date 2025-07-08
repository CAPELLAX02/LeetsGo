public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[] { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutiveBruteForce(nums)); // 4
        System.out.println(longestConsecutive(nums));           // 4
        // Explanation: The longest consecutive sequence is [1, 2, 3, 4] thus output is 4.
    }

    private static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    static int longestConsecutiveBruteForce(int[] nums) {
        return 0;
    }

    static int longestConsecutive(int[] nums) {
        return 0;
    }
}
