import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Num2215 {
    public static void main(String[] args) {
//        int[] nums1 = {1,2,3};
//        int[] nums2 = {2,4,6};

        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> num1List = new HashSet<>();
        HashSet<Integer> num2List = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            boolean isPresent1 = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    isPresent1 = true;
                }
            }
            if (!isPresent1) {
                num1List.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            boolean isPresent2 = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    isPresent2 = true;
                }
            }
            if (!isPresent2) {
                num2List.add(nums2[i]);
            }
        }
        List<Integer> temp1 = new ArrayList<>(num1List);
        List<Integer> temp2 = new ArrayList<>(num2List);
        res.add(temp1);
        res.add(temp2);
        return res;
    }
}
