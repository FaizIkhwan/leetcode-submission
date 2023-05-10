public class Num2011 {
    public static void main(String[] args) {
//        String[] operations = {"--X","X++","X++"};
//        String[] operations = {"++X","++X","X++"};
        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String operation: operations) {
            if (operation.equals("X++") || operation.equals("++X")) {
                res++;
            } else {
                res--;
            }
        }
        return res;
    }
}
