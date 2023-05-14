import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//public class Num6369 {
//    public static void main(String[] args) {
//        int[] nums = {12,9};
//        int k = 1;
//
////        int[] nums = {8, 1, 2};
////        int k = 2;
//
//        System.out.println(maximumOr(nums, k));
//    }
//
//    public static long maximumOr(int[] nums, int k) {
//        HashMap<Integer, Integer> multiplyList = new HashMap<>();
//        long max = 0L;
//        for (int i = 0; i < nums.length; i++) {
//            int[] temp = Arrays.copyOf(nums, nums.length);
//            for (int j = 0; j < k; j++) {
//                if (multiplyList.containsKey(nums[i])) {
//                    temp[i] = multiplyList.get(nums[i]);
//                    break;
//                }
//                temp[i] *= 2;
//            }
//            multiplyList.put(nums[i], temp[i]);
//
//            long sum = 0L;
//            for (int j = 0; j < temp.length; j++) {
//                sum |= temp[j];
//            }
//            if (max < sum) {
//                max = sum;
//            }
//        }
//        return max;
//    }
//}
