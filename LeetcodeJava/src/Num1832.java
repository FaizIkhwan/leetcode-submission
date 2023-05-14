import java.util.HashSet;

public class Num1832 {
    public static void main(String[] args) {
//        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> characterList = new HashSet<>();
        for (Character character: sentence.toCharArray()) {
            if (!characterList.contains(character)) {
                characterList.add(character);
            }
        }
        return characterList.size() == 26;
    }
}
