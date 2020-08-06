package lesson02;

public class HelloInteger {
    public static void main(String[] args) {
        goodMorningInteger();
        findSquare();
    }
    public static void goodMorningInteger(){
        //my code
        int a = 2; //sign of appropriation
        int b = 3;
        int c = a + b;

        System.out.println("Summ of a and b = " + c);

        int jeans = 40;
        int pullover = 50;
        int baseCap = 15;
        int sum = jeans + pullover + baseCap;
        System.out.println("For everything to pay = "+ (jeans+pullover+baseCap) + "Euro");

        System.out.println("check articles = " + sum);

    }

    public static void findSquare(){
        int myFirstVariable = 5;
        int square = myFirstVariable * myFirstVariable;
        int perimeter = 4 * myFirstVariable;
        System.out.println("Squares square = " + square );
        System.out.println("Squares perimeter = " + perimeter);
    }

}
