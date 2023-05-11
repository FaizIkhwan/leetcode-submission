public class Num2535 {
    public static void main(String[] args) {
//        int[] nums = {1,15,6,3};
        int[] nums = {1,2,3,4};
        System.out.println(differenceOfSum(nums));
    }

    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
            String temp = String.valueOf(nums[i]);
            for (int j = 0; j < temp.length(); j++) {
                digitSum += Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}
