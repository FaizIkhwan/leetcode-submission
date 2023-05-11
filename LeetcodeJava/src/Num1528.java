public class Num1528 {
    public static void main(String[] args) {
//        String s = "codeleet";
//        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "abc";
        int[] indices = {0,1,2};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for (int i = 0; i < s.length(); i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}
