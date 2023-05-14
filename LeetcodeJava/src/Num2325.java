import java.util.HashMap;

public class Num2325 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

//        String key = "the quick the";
//        String message = "kbs bs t suepuv";

//        String key = "eljuxhpwnyrdgtqkviszcfmabo";
//        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";

        System.out.println(decodeMessage(key, message));
    }

    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> characterList = new HashMap<>();
        char a = 'a';
        for (Character character: key.toCharArray()) {
            if (!characterList.containsKey(character) && !character.equals(' ')) {
                characterList.put(character, a++);
            }
        }
        StringBuilder sb = new StringBuilder();
//        String res = "";
        for (Character character: message.toCharArray()) {
            if (character.equals(' ')) {
                sb.append(' ');
//                res += ' ';
            } else {
                sb.append(characterList.get(character));
//                res += characterList.get(character);
            }
        }
        return sb.toString();
    }
}
