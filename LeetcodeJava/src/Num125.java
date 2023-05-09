import java.util.Locale;

public class Num125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
//        String s = " ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String alteredString = s.toLowerCase(Locale.ROOT);
        alteredString = alteredString.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(alteredString);
        return alteredString.equals(s);
    }
}
