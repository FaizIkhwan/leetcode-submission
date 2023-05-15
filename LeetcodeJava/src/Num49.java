import java.util.*;

public class Num49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//        String[] strs = {""};
//        String[] strs = {"a"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedWord = String.valueOf(charArray);
            List<String> temp = hashMap.getOrDefault(sortedWord, new ArrayList<>());
            temp.add(strs[i]);
            hashMap.put(sortedWord, temp);
        }
        return new ArrayList<>(hashMap.values());
    }
}
