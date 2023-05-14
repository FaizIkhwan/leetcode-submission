import java.util.HashSet;

public class Num771 {
    public static void main(String[] args) {
//        String jewels = "aA";
//        String stones  = "aAAbbbb";

        String jewels = "z";
        String stones  = "ZZ";

        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsList = new HashSet<>();
        for (char jewel: jewels.toCharArray()) {
            jewelsList.add(jewel);
        }

        int res = 0;
        for (char stone: stones.toCharArray()) {
            if (jewelsList.contains(stone)) {
                res++;
            }
        }

        return res;
    }
}
