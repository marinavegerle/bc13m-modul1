package lesson21;

import java.util.Scanner;

public class MyLovelyScanner {
    public static void main(String[] args) {
        findNumber(100);

        //  helloCustomer();

       /* System.out.print("Hello World");
        System.out.println();

        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("How old are you");
        age = input.nextInt();
        if (age >= 18) {
            System.out.println("You can buy any Alcohol drink you want");
        } else {
            System.out.println("Get out, boy!");
        }
        System.out.println("Whats your name?");
        String name = input.next();
        System.out.println("Hi " + name);*/
    }

    public static void helloCustomer() {
        String name = "", surname = "", gender = "", email = "";
        int age = 0;
        Scanner customerInput = new Scanner(System.in);
        System.out.println("Whats your name?");
        name = customerInput.next();
        System.out.println("Whats your surname?");
        surname = customerInput.next();
        System.out.println("Your gender?");
        gender = customerInput.next();
        System.out.println("Your email?");
        email = customerInput.next();
        System.out.println("Your age?");
        age = customerInput.nextInt();

        System.out.println("Welcome to our Website!" + name);
        System.out.println("Please check your information " + name + surname + gender + email + age);
    }

    public static void findNumber(int n) {
        int userNumber = 0;
        int number = (int) (Math.random() * ((n - 1) + 1)) + 1;
        System.out.println(number);

        for (int i = 1; i <= 3; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.println(i + " First try");
            userNumber = userInput.nextInt();

            if (number > userNumber) {
                System.out.println("Wrong answer");
            } else if (number < userNumber) {
                System.out.println("Wrong answer again");
            } else
                System.out.println(("Yeas! You are right!"));

        }
        System.out.println("Game is over");
    }
}