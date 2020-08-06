package HomeWork;

public class HWwhile {
    public static void main(String[] args) {
     //  firstWhile(2,4);
        System.out.println("--------------");
        secondWhile(5);

    }

    private static void firstWhile(int a, int b) {
        int i = 0;
        do {
            System.out.println(a);
            i++;
        } while (i > 0);
    }

    private static void secondWhile(int i) {
        while (true) {
            System.out.println(i);
            i++;
            if (i > 17) {
                break;
            }
        }
    }
}
