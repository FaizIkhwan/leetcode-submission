import java.util.ArrayList;

public class Num5976 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {3,1,2}, {2,3,1}};
        System.out.println(checkValid(matrix));
    }

    public static boolean checkValid(int[][] matrix) {
        ArrayList<Integer> dict = new ArrayList<Integer>();
        for (int i = 1; i <= matrix.length; i++) {
            dict.add(i);
        }

        for (int i = 0; i < matrix.length; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(dict);
            boolean rowStatusTemp = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (!temp.contains(matrix[i][j])) {
                    rowStatusTemp = false;
                    return false;
                }
                temp.remove(temp.indexOf(matrix[i][j]));
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(dict);
            boolean columnStatusTemp = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (!temp.contains(matrix[j][i])) {
                    columnStatusTemp = false;
                    return false;
                }
                temp.remove(temp.indexOf(matrix[j][i]));
            }
        }
        return true;
    }
}
