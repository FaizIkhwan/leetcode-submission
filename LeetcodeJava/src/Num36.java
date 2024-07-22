import java.util.HashMap;
import java.util.HashSet;

public class Num36 {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character> rowCharacters = new HashSet<>();
        HashSet<Character> columnCharacters = new HashSet<>();
        HashMap<String, HashSet<Character>> hashMap = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            rowCharacters.clear();
            columnCharacters.clear();
            for (int j = 0; j < board[i].length; j++) {
                if (rowCharacters.contains(board[i][j])) {
                    return false;
                }
                if (columnCharacters.contains(board[j][i])) {
                    return false;
                }
                if (board[i][j] != '.') {
                    rowCharacters.add(board[i][j]);
                }if (board[j][i] != '.') {
                    columnCharacters.add(board[j][i]);
                }

                String key = (i / 3) + "" + (j / 3);
                HashSet<Character> temp = new HashSet<>();
                if (hashMap.containsKey(key)) {
                    temp = hashMap.get(key);
                    if (temp.contains(board[i][j])) {
                        return false;
                    } else if (board[i][j] != '.') {
                        temp.add(board[i][j]);
                        hashMap.put(key, temp);
                    }
                } else if (board[i][j] != '.') {
                    temp.add(board[i][j]);
                    hashMap.put(key, temp);
                }
            }
        }
        return true;
    }
}
