public class Num5194 {
    public static void main(String[] args) {
        int target = 5;
        int maxDoubles = 4;
        System.out.println(minMoves(target, maxDoubles));
    }

    public static int minMoves(int target, int maxDoubles) {
        return move(1, target, maxDoubles, maxDoubles);
    }

    public static int move(int n, int target, int maxDoubles, int doubleUsed) {
        System.out.println("n: " + n);
        if (n > target) {
            return 0;
        } else if (n == target) {
            return 1;
        }

        if (doubleUsed > maxDoubles) {
            System.out.println("first");
            int tempA = n + 1;
            return move(tempA, target, maxDoubles, doubleUsed);
        } else {
            System.out.println("second");
            int tempA = n + 1;
            int tempB = n * 2;
            int tempC = doubleUsed - 1;
            return move(tempA, target, maxDoubles, doubleUsed) + move(tempB, target, maxDoubles, tempC);
        }
    }
}
