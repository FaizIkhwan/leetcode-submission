import java.util.Scanner;

public class CodeForcesA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String constant = "codeforces";
            res = 0;
            for (int j = 0; j < s.length(); j++) {
                if (constant.charAt(j) == s.charAt(j)) {
                    res++;
                }
            }
            System.out.println(res);
            res = 0;
        }

        sc.close();
    }
}