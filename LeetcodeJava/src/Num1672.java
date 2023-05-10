public class Num1672 {
    public static void main(String[] args) {
//        int[][] accounts = {{1,2,3}, {3,2,1}};
//        int[][] accounts = {{1,5}, {7,3}, {3,5}};
        int[][] accounts = {{2,8,7}, {7,1,3}, {1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                current += accounts[i][j];
            }
            if (max < current) {
                max = current;
            }
            current = 0;
        }
        return max;
    }
}
