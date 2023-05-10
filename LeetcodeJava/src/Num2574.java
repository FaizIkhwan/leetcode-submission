import java.util.Arrays;

public class Num2574 {
    public static void main(String[] args) {
//        int[] nums = {10,4,8,3};
        int[] nums = {1};
        System.out.println(Arrays.toString(leftRigthDifference(nums)));
    }

    public static int[] leftRigthDifference(int[] nums) {
        int[] res = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                left[i] = 0;
            } else {
                left[i] = sumLeft;
            }
            sumLeft += nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length) {
                right[i] = 0;
            } else {
                right[i] = sumRight;
            }
            sumRight += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = Math.abs(left[i] - right[i]);
        }
        return res;
    }
}
