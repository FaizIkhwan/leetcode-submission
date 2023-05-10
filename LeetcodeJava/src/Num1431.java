import java.util.ArrayList;
import java.util.List;

public class Num1431 {
    public static void main(String[] args) {
//        int[] candies = {2,3,5,1,3};
//        int extraCandies = 3;
//        int[] candies = {4,2,1,1,2};
//        int extraCandies = 1;
        int[] candies = {12,1,12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int candy: candies) {
            if (candy + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
