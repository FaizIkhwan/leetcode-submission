public class Num2656 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5};
//        int k = 3;
        int[] nums = {5,5,5};
        int k = 2;
        System.out.println(maximizeSum(nums, k));
    }

    public static int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int num: nums) {
            if (num > max) {
                max = num;
            }
        }
        int res = max;
        for (int i = 1; i < k; i++) {
            max += 1;
            res += max;
        }
        return res;
    }
}
