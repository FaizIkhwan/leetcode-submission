import java.util.*;

public class Num347 {
    public static void main(String[] args) {
//        int[] nums = {1,1,1,2,2,2,2,3};
//        int k = 2;
        int[] nums = {1};
        int k = 1;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[k];
        for (int i = 0; i < nums.length; i++) {
            int temp = hashMap.getOrDefault(nums[i], 0);
            hashMap.put(nums[i], ++temp);
        }
        int i = 0;
        Map<Integer, Integer> sortedMap = sortByComparator(hashMap, false);
        for (Map.Entry<Integer, Integer> set: sortedMap.entrySet()) {
            if (i == k) {
                break;
            }
            res[i++] = set.getKey();
        }
        return res;
    }

    private static Map<Integer, Integer> sortByComparator(Map<Integer, Integer> unsortMap, final boolean order) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(unsortMap.entrySet());
        // Sorting the list based on values
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(
                Map.Entry<Integer, Integer> o1,
                Map.Entry<Integer, Integer> o2
            ) {
                if (order) {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });
        // Maintaining insertion order with the help of LinkedList
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
