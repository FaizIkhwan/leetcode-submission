import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num1282 {
    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};
//        int[] groupSizes = {2,1,3,3,3,2};
        System.out.println(groupThePeople(groupSizes));
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int n = groupSizes[i];
            List<Integer> temp = hashMap.get(groupSizes[i]);
            if (temp == null) {
                temp = new ArrayList<>();
            }
            temp.add(i);
            hashMap.put(groupSizes[i], temp);

            if (n == temp.size()) {
                res.add(temp);
                hashMap.remove(n);
            }
        }
        return res;
    }
}
