package lesson02;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("() {} <> ~ + // ! ");
        System.out.println();

        customerInfo();
        thankYou();
        showByExit();

    }
    public static void customerInfo(){
        System.out.println("3,60 Euro to pay please!");

    }
    public static void thankYou() {
        System.out.println("Thank you for the order!");

    }
    public static void showByExit(){
        System.out.println("Here is going to be an arifmetic operation 3+5 " + 5 + 3);
        System.out.print("My name is Marina\t");
        System.out.print("But I want \nto be Elena");
        System.out.print(" ln = New Line");
        System.out.print("\n");
        System.out.print("\u0423\u0440\u0430\n");
    }

}
