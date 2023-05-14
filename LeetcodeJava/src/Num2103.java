import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Num2103 {
    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9R0";
//        String rings = "B0R0G0R9R0B0G0";
//        String rings = "G4";
        System.out.println(countPoints(rings));
    }

    public static int countPoints(String rings) {
        int res = 0;
        HashMap<Character, ArrayList<Character>> rodList = new HashMap<>();
        for (int i = 0; i < rings.length() - 1; i += 2) {
            String command = rings.substring(i, i + 2);
            if (rodList.get(command.charAt(1)) == null) {
                rodList.put(command.charAt(1), new ArrayList(Arrays.asList(command.charAt(0))));
            } else {
                ArrayList<Character> tempList = rodList.get(command.charAt(1));
                tempList.add(command.charAt(0));
                rodList.put(command.charAt(1), tempList);
            }
        }
        for (int i = 48; i <= 57; i++) {
            ArrayList<Character> tempList = rodList.get((char) i);
            if (tempList == null) {
                continue;
            }
            if (tempList.contains('R') && tempList.contains('G') && tempList.contains('B')) {
                res++;
            }
        }
        return res;
    }
}
