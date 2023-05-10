public class Num2114 {
    public static void main(String[] args) {
//        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int res = Integer.MIN_VALUE;
        int current = 0;
        for (String sentence: sentences) {
            current = sentence.split(" ").length;
            if (res < current) {
                res = current;
            }
        }
        return res;
    }
}
