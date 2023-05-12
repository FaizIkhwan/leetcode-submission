import java.util.HashSet;

public class Num217 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,1};
//        int[] nums = {1,2,3,4};
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num: nums) {
            if (numbers.contains(num)) {
                return true;
            }
            numbers.add(num);
        }
        return false;
    }
}
