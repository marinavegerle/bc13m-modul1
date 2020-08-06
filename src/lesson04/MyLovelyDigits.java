package lesson04;

public class MyLovelyDigits {

    public static void main(String[] args) {
        myDouble();

    }

    public static void myIntegers() {
        int i = 10;
        int b = 20;
        short s = 56;
        long l = 1;
    }
    public static void myDouble() {
        double d = 50.0;
        float f = 75.0f;
        double myConst = Math.PI;
        System.out.println("myConst from library Math = " + myConst);
        double test = Math.pow(d,f);

        double myNewPI = myLovelyRound(myConst);
        System.out.println("myNewPi округленное значение  = " + myNewPI);
    }

    public static double myLovelyRound (double digitsToRound){
        double temp0 = digitsToRound * 100;
        System.out.println("1. First step: умножаем на 100 - temp0 = " + temp0);
        int temp1 = (int) temp0;
        System.out.println("2. Second step: присваеваем значение double инту = " + temp1);

        temp0 = temp1;
        System.out.println("3. Third step: мы присваеваем интовое значение чтобы мы могли 'делить' = "
        +temp0);
        temp0 = temp0/100;
        System.out.println("4. Must be the end result = " + temp0);

        return temp0;

    }

}
