import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num242 {
    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";

//        String s = "rat";
//        String t = "car";

        String s = "a";
        String t = "ab";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        String sString = new String(sChar);
        String tString = new String(tChar);
        return sString.equals(tString);
    }
}
