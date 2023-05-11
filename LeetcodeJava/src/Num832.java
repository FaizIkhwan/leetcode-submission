import java.util.Arrays;

public class Num832 {
    public static void main(String[] args) {
//        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] image = {{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[] temp;
        for (int i = 0; i < image.length; i++) {
            temp = new int[image[i].length];
            for (int j = 0; j < image.length; j++) {
                temp[j] = image[i][image.length - j - 1];
                if (temp[j] == 1) {
                    temp[j] = 0;
                } else {
                    temp[j] = 1;
                }
            }
            image[i] = temp;
        }
        return image;
    }
}
