import java.util.ArrayList;
import java.util.Arrays;

public class Num2553 {
    public static void main(String[] args) {
//        int[] nums = {13,25,83,77};
        int[] nums = {7,1,3,9};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }

    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num: nums) {
            String numString = String.valueOf(num);
            for (int i = 0; i < numString.length(); i++) {
                arrayList.add(Integer.parseInt(String.valueOf(numString.charAt(i))));
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}
