import java.util.*;
import java.util.stream.Collectors;

//public class Num2610 {
//    public static void main(String[] args) {
//        int[] nums = {1,3,4,1,2,3,1};
////        int[] nums = {8,8,8,8,2,4,4,2,4};
////        int[] nums = {1,2,3,4};
//        System.out.println(findMatrix(nums));
//    }
//
//    public static List<List<Integer>> findMatrix(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        Set<Integer> set = new HashSet<>();
////        for (int i = 0; i < nums.length; i++) {
////            if (!set.contains(nums[i])) {
////                set.add(nums[i]);
////            } else {
////                List<Integer> temp = new ArrayList<>(set);
////                res.add(temp);
////                set.clear();
////                set.add(nums[i]);
////            }
////        }
//        while (!list.isEmpty()) {
//            int n = list.size();
//            System.out.println("n: " + n);
////            for (int i = 0; i < n; i++) {
////                if (!set.contains(list.get(i))) {
////                    set.add(list.remove(i));
////                    System.out.println(list.size());
////                }
////            }
//            for (Integer num: list) {
//                if (!set.contains(num)) {
//                    set.add(num);
//                    list.remove(num);
//                }
//            }
//        }
//        System.out.println(set);
//        if (!set.isEmpty()) {
//            List<Integer> temp = new ArrayList<>(set);
//            res.add(temp);
//        }
//        return res;
//    }
//}
