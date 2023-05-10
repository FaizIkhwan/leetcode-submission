import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Num1313 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
        int[] nums = {1,1,2,3};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] res;

        for (int i = 0; i < nums.length; i+=2) {
            ArrayList<Integer> temp = new ArrayList<>(Collections.nCopies(nums[i], nums[i + 1]));
            list.addAll(temp);
        }

        res = new int[list.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
