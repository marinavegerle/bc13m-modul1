package HomeWork;

public class HW24 {
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));//2
        System.out.println(dateFashion(5, 2));//0
        System.out.println(dateFashion(5, 5));//1
        System.out.println("-----------------------------------");
        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4)); //→ 20
        System.out.println(sortaSum(10, 11));// → 21
    }

    private static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else
            return a + b;
    }

    private static int dateFashion(int myStyle, int dateStyle) {
        if (myStyle < 5 || dateStyle < 5) {
            return 0;
        } else if (myStyle < 5 || dateStyle <= 5) {
            return 1;
        }
        return 2;
    }

}
