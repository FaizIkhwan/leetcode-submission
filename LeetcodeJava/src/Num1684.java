import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Num1684 {
    public static void main(String[] args) {
//        String allowed = "ab";
//        String[] words = {"ad","bd","aaab","baa","badab"};

//        String allowed = "abc";
//        String[] words = {"a","b","c","ab","ac","bc","abc"};
//
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};

        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        boolean isAllowed;
        Set<Character> unique = new HashSet<>();
        for (char c: allowed.toCharArray()) {
            unique.add(c);
        }
        for (String word: words) {
            isAllowed = true;
            for (int i = 0; i < word.length(); i++) {
                if (!unique.contains(word.charAt(i))) {
                    isAllowed = false;
                }
            }
            if (isAllowed) {
                res++;
            }
        }
        return res;
    }
}
