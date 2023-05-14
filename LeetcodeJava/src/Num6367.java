import java.util.Arrays;

public class Num6367 {
    public static void main(String[] args) {
//        int[][] nums = {{7,2,1}, {6,4,2}, {6,5,3}, {3,2,1}};
        int[][] nums = {{1,2,4}, {3,3,1}};
//        int[][] nums = {{1}};
        System.out.println(matrixSum(nums));
    }

    public static int matrixSum(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
            System.out.println(Arrays.toString(nums[i]));
        }
        int cost = 0;
        for (int i = 0; i < nums[0].length; i++) {
            int max = 0;
            for (int j = 0; j < nums.length; j++)
                if (max < nums[j][i])
                    max = nums[j][i];
            cost += max;
        }
        return cost;
    }
}
