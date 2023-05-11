import java.util.Arrays;
import java.util.List;

public class Num1773 {
    public static void main(String[] args) {
//        List<List<String>> items = Arrays.asList(
//          Arrays.asList("phone","blue","pixel"),
//          Arrays.asList("computer","silver","lenovo"),
//          Arrays.asList("phone","gold","iphone")
//        );
//        String ruleKey = "color";
//        String ruleValue = "silver";

        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","phone"),
                Arrays.asList("phone","gold","iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    public static int countMatches(
        List<List<String>> items,
        String ruleKey,
        String ruleValue
    ) {
        int res = 0;
        for (int i = 0; i < items.size(); i++) {
            switch (ruleKey) {
                case "type":
                    if (items.get(i).get(0).equals(ruleValue)) {
                        res++;
                    }
                    break;
                case "color":
                    if (items.get(i).get(1).equals(ruleValue)) {
                        res++;
                    }
                    break;
                case "name":
                    if (items.get(i).get(2).equals(ruleValue)) {
                        res++;
                    }
                    break;
            }
        }
        return res;
    }
}
