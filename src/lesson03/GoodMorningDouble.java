package lesson03;

public class GoodMorningDouble {
    public static void main(String[] args) {
        // 3,5 => 3.5  100_34534_34534
        helloDouble();
        findSquareCircle();
        helloDouble();
        helloDoubleTwo();

    }

    public static void helloFloat() {
        float a, b, c, d, e, f, g;
         a = 3.5f;
         b = 4.5f;
         c = (float) 5.5;
         d = a + b + c;
        System.out.println("a + b + c: " + d);
        f = 10.0f;

    }
    public static void helloDouble (){
        double a, b, c;
        int d, f, e;

        d = 10; // I have 10 Euro
        f = 1000; //Iphone costs 1000 Euro

        //how many Iphones can I buy for 10 Euro;
        e = d / f;
        System.out.println("Quantity of Iphones I can buy for 10 Euro = " + e );

        a = 10.0; //10 euro and 0 cent
        b = 20.0; //20 euro cost 1 kg of cherries
        c = a / b;//how many cherries I can buy
        System.out.println("How many cherries I can buy = " + c);

    }
    public static void findSquareCircle (){
        final double PI = 3.14;
        //final = used to "final" of variable,
        //now and forever variable "PI| can not be changed.
        double r = 10;
        double square = PI * r * r;
        double anotherSquare = Math.PI * Math.pow(r, 2);
        double anotherPI = Math.PI;
        System.out.println("Square found with hands = " + square );
        System.out.println("Square found with Java = " + anotherSquare);
    }
    public static void helloDoubleTwo (){
        double a = 10;
        double b = 5;
        double c = Math.pow (b,a);
        System.out.println("вроде как пять в степени 10 = " + c);
    }


}
