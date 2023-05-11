public class Num2006 {
    public static void main(String[] args) {
//        int[] nums = {1,2,2,1};
//        int k = 1;
//        int[] nums = {1,3};
//        int k = 3;
        int[] nums = {3,2,1,5,4};
        int k = 2;
        System.out.println(countKDifference(nums, k));
    }

    public static int countKDifference(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    res++;
                }
            }
        }
        return res;
    }
}
