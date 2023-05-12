import java.util.Arrays;

public class Num2418 {
    public static void main(String[] args) {
//        String[] names = {"Mary","John","Emma"};
//        int[] height = {180,165,170};

        String[] names = {"Alice","Bob","Bob"};
        int[] height = {155,185,150};
        System.out.println(Arrays.toString(sortPeople(names, height)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        for(int i = 1; i < heights.length; i++) {
            int j = i;
            while(j > 0 && heights[j] > heights[j-1]) {
                int temp = heights[j];
                String tempName = names[j];
                heights[j] = heights[j-1];
                heights[j-1] = temp;
                names[j] = names[j-1];
                names[j-1] = tempName;
                j--;
            }
        }
        return names;
    }
}
