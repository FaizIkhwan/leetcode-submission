import java.util.ArrayList;
import java.util.Arrays;

public class Num6416 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5};
        int[] nums = {3,2,3,4,2};
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        ArrayList<Integer> prefixList = new ArrayList<>();
        ArrayList<Integer> suffixList = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int distinctValueSuffix = 0;
            int distinctValuePrefix = 0;
            for (int k = 0; k <= i; k++) {
                if (!prefixList.contains(nums[k])) {
                    prefixList.add(nums[k]);
                    distinctValuePrefix++;
                }
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (!suffixList.contains(nums[j])) {
                    suffixList.add(nums[j]);
                    distinctValueSuffix++;
                }
            }
            suffixList.clear();
            prefixList.clear();
            finalList.add(distinctValuePrefix - distinctValueSuffix);
        }

        int[] res = finalList.stream().mapToInt(i -> i).toArray();
        return res;
    }
}
