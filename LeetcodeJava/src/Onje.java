import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class Onje {
    public static void main(String[] args) {
        Map<Integer, String> valuesMap = new HashMap<Integer, String>();
        Map<Integer, String> newValuesMap = new HashMap<Integer, String>();
        valuesMap.put(1, "Red");
        valuesMap.put(2, "Blue");
        valuesMap.put(3, "Green");
        valuesMap.put(4, "Orange");
        valuesMap.put(5, "Black");
        valuesMap.put(6, "White");
        for (Integer key: valuesMap.keySet()) {
            if (key == 3 || key == 6) {
                newValuesMap.put(key, valuesMap.get(key));
            }
        }

        System.out.println(newValuesMap);
    }
}
