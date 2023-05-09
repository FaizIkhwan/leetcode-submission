import java.util.Arrays;

public class Num1470 {
    public static void main(String[] args) {
//        int[] nums = {2,5,1,3,4,7};
//        int n = 3;
//        int[] nums = {1,2,3,4,4,3,2,1};
//        int n = 4
        int[] nums = {1,1,2,2};
        int n = 2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int[] num1 = Arrays.copyOfRange(nums, 0, n);
        int[] num2 = Arrays.copyOfRange(nums, n, nums.length);
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = num1[i1++];
            } else {
                res[i] = num2[i2++];
            }
        }
        return res;
    }
}
