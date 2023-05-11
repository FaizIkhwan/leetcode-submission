public class Num1662 {
    public static void main(String[] args) {
//        String[] word1 = {"ab", "c"};
//        String[] word2 = {"a", "bc"};

//        String[] word1 = {"a", "cb"};
//        String[] word2 = {"ab", "c"};
//
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordLong1 = "";
        String wordLong2 = "";

        for (String word: word1) {
            wordLong1 += word;
        }
        for (String word: word2) {
            wordLong2 += word;
        }

        return wordLong1.equals(wordLong2);
    }
}
