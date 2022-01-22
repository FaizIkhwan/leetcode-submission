import java.util.Arrays;

public class Num5971 {
    public static void main(String[] args) {
        int[] cost = {5};
        System.out.println(minimumCost(cost));
    }

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        return findMinimum(cost);
    }

    static int findMinimum(int[] arr) {
        int res = 0;
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (count == 2) { // if buy 2 already, skip
                count = 0;
                continue;
            }
            res += arr[i]; // Buy
            count++; // Count candy if reach 2
        }
        return res;
    }
}
