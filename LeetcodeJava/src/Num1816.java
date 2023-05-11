public class Num1816 {
    public static void main(String[] args) {
//        String s = "Hello how are you Contestant"; int k = 4;
//        String s = "What is the solution to this problem"; int k = 4;
        String s = "chopper is not a tanuki"; int k = 5;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        String res = "";
        int count = 0;
        for (String word: s.split(" ")) {
            count++;
            if (count <= k) {
                res += word + " ";
            } else {
                break;
            }
        }
        return res.substring(0, res.length() - 1);
    }
}
