import java.util.ArrayList;

public class Num1456 {
    public static void main(String[] args) {
//        String s = "abciiidef";
//        int k = 3;

//        String s = "aeiou";
//        int k = 2;

//        String s = "aeiou";
//        int k = 3;

        String s = "leetcode";
        int k = 3;

        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int max = 0;
        int current = 0;
        char currentChar = 'a';

        for (int i = 0; i <= s.length() - k; i++) {
            for (int j = i; j < k + i; j++) {
                currentChar = s.charAt(j);
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                    current++;
                    if (current > max) {
                        max = current;
                    }
                }
            }
            if (i > max) {
                break;
            }
            current = 0;
        }
        return max;
    }
}
