import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));           // [24, 12, 8, 6]
        System.out.println(Arrays.toString(productExceptSelfBruteForce(nums))); // [24, 12, 8, 6]
    }

    static int[] productExceptSelfBruteForce(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            int product = 1;
            for (int j = 0; j < len; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            res[i] =  product;
        }
        return res;
    }

    static int[] productExceptSelf(int[] nums) {
        int len =  nums.length;
        int[] res = new int[len];

        // Sol çarpanları doldur
        res[0] = 1;
        for (int i = 1; i < len; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // Sağ çarpanlarla çarp
        int right = 1;
        for (int i = len - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        return res;
    }
}