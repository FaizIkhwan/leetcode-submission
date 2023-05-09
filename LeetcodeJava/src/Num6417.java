import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Num6417 {
    public static void main(String[] args) {
        FrequencyTracker obj = new FrequencyTracker();
//        obj.add(3);
//        obj.add(3);
//        System.out.println(obj.hasFrequency(2));
//        System.out.println(obj.frequencyList);

//        obj.add(1);
//        obj.deleteOne(1);
//        System.out.println(obj.hasFrequency(2));
//        System.out.println(obj.frequencyList);

        System.out.println(obj.hasFrequency(2));
        obj.add(3);
        System.out.println(obj.hasFrequency(1));
        System.out.println(obj.frequencyList);

//        obj.add(3);
//        obj.add(4);
//        obj.add(1);
//        obj.deleteOne(2);
//        obj.deleteOne(1);
//        System.out.println(obj.hasFrequency(1));
//        System.out.println(obj.hasFrequency(2));
//        System.out.println(obj.hasFrequency(3));
//        System.out.println(obj.hasFrequency(4));

//        obj.deleteOne(1);
//        System.out.println(obj.hasFrequency(2));
//        obj.add(3);
//        System.out.println(obj.hasFrequency(1));
//        System.out.println(obj.frequencyList);

    }
}

class FrequencyTracker {

    HashMap<Integer, Integer> frequencyList;

    public FrequencyTracker() {
        frequencyList = new HashMap<>();
    }

    public void add(int number) {
        int currentFrequency = frequencyList.getOrDefault(number, 0);
        frequencyList.put(number, ++currentFrequency);
    }

    public void deleteOne(int number) {
        int currentFrequency = frequencyList.getOrDefault(number, 0);
        if (currentFrequency > 0) {
            frequencyList.put(number, --currentFrequency);
        }
    }

    public boolean hasFrequency(int frequency) {
        for (Map.Entry<Integer, Integer> entry : frequencyList.entrySet()) {
            if (entry.getValue().equals(frequency)) {
                return true;
            }
        }
        return false;
    }
}
