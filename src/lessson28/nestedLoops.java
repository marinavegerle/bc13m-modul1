package lessson28;

public class nestedLoops {
    public static void main(String[] args) {
        multiplicationTable(10);
    }

    private static void multiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(formatForMPTable(i, j));
            }
            System.out.println();
        }
    }

    private static String formatForMPTable(int i, int j) {
        String result = "" + i * j;
        if (i * j < 10) {
           result = "   " + i * j;
        } else if (i * j < 100) {
            result = "  " + String.valueOf(i * j);
        }else if (i * j < 1000) {
            result = " " + String.valueOf(i * j);
            return result;
        }
        return result;
    }


}
