public class Num2652 {
    public static void main(String[] args) {
//        int n = 7;
//        int n = 10;
        int n = 9;
        System.out.println(sumOfMultiples(n));
    }

    public static int sumOfMultiples(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                res += i;
            }
        }
        return res;
    }
}
