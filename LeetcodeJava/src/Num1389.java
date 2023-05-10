import java.util.ArrayList;
import java.util.Arrays;

public class Num1389 {
    public static void main(String[] args) {
//        int[] nums = {0,1,2,3,4};
//        int[] index = {0,1,2,2,1};
//        int[] nums = {1,2,3,4,0};
//        int[] index = {0,1,2,3,0};
        int[] nums = {1};
        int[] index = {0};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] res1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            res1[i] = res.get(i);
        }

        return res1;
    }
}
