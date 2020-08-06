package HomeWork;

public class HW30 {
    public static void main(String[] args) {

        System.out.println(greatestCommonDivisor(15, 60));//15
        System.out.println(greatestCommonDivisor(7, 3));//1
        System.out.println(greatestCommonDivisor(5, 15));//5
        System.out.println(greatestCommonDivisor(9, 12));//3
    }

    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }
}
