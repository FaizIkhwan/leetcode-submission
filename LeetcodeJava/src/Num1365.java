import java.util.Arrays;

public class Num1365 {
    public static void main(String[] args) {
//        int[] nums = {8,1,2,2,3};
//        int[] nums = {6,5,4,8};
        int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
