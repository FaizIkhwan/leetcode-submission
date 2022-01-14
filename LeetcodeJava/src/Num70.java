import java.util.Arrays;

public class Num70 {

    static int[] memo = new int[46];

    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        Arrays.fill(memo, -1);
        return climb(n);
    }

    public static int climb(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }

        if (memo[n] != -1) {
            return memo[n];
        } else {
            memo[n] = climb(n - 1) + climb(n - 2);
            return memo[n];
        }
    }
}
