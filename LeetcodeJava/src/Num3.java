import java.util.ArrayList;

public class Num3 {
    public static void main(String[] args) {
        String s = " E@";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        String res = "";
        String temp = "";
//        ArrayList<Character> dict = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            System.out.println("temp: " + temp);
            System.out.println("String.valueOf(s.charAt(i))): " + String.valueOf(s.charAt(i)));
            if (!temp.contains(String.valueOf(s.charAt(i)))) {
                System.out.println("iff");
                temp += String.valueOf(s.charAt(i));

                if (temp.length() > res.length()) {
                    res = temp;
                    temp = "";
                    temp += String.valueOf(s.charAt(i));
                    System.out.println("res: " + res);
                }
            } else {
                System.out.println("else");
//                if (temp.length() > res.length()) {
//                    res = temp;
//                    temp = "";
//                    temp += String.valueOf(s.charAt(i));
//                    System.out.println("res: " + res);
//                }
            }
//            if (temp.contains(String.valueOf(s.charAt(i)))) {
//                if (temp.length() > res.length()) {
//                    System.out.println("temppp: " + temp);
//                    res = temp;
//                    temp = "";
//                }
//                temp += String.valueOf(s.charAt(i));
//            } else {
////                dict.add(s.charAt(i));
//                temp += String.valueOf(s.charAt(i));
//            }
        }
        if (res.length() > 0) {
            return res.length();
        } else {
            return temp.length();
        }
    }
}
