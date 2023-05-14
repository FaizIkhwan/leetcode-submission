import java.util.HashSet;

public class Num804 {
    public static void main(String[] args) {
//        String[] words = {"gin","zen","gig","msg"};
        String[] words = {"a"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCodeList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> wordList = new HashSet<>();
        for (String word: words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(morseCodeList[((int) word.charAt(i)) - 97]);
            }
            wordList.add(sb.toString());
        }
        return wordList.size();
    }
}
