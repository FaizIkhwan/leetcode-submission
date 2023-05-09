import java.util.Arrays;
import java.util.HashSet;

public class Num26 {
    public static void main(String[] args) {
//        int[] input = {0,0,1,1,1,2,2,3,3,4};
        int[] input = {1,1,2};
        System.out.println(removeDuplicates(input));
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        int res = 0;
        for (int num: nums) {
            System.out.println("num: " + num);
            if (!list.contains(num)) {
                list.add(num);
                res++;
            }
        }
        System.out.println("list: " + list);
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("list.size(): " + list.size());

        return res;
    }
}
