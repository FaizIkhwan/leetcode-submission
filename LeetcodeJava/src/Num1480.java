import java.util.Arrays;

public class Num1480 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
//        int[] nums = {1,1,1,1,1};
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res[i] = sum;
        }
        return res;
    }
}
