import java.util.ArrayList;
import java.util.Arrays;

public class Num5980 {
    public static void main(String[] args) {
        String s = "a";
        int k = 2;
        char fill = 'x';
        System.out.println(divideString(s, k, fill));
    }

    public static String[] divideString(String s, int k, char fill) {
        ArrayList<String> res = new ArrayList<>();
        int counter = 0;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            counter++;
            temp += String.valueOf(s.charAt(i));
            if (counter == k) {
                res.add(temp);
                temp = "";
                counter = 0;
            }
        }

        if (!temp.isEmpty()) {
            for (int i = 1; i <= k; i++) {
                if (i > temp.length()) {
                    temp += String.valueOf(fill);
                }
            }

            res.add(temp);
            temp = "";
        }

        Object[] gfg = res.toArray();
        return Arrays.copyOf(gfg, gfg.length, String[].class);
    }
}
