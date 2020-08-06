package lesson21;

import java.util.Scanner;

public class WestWorld {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        int k = tryAndCry();
        int number = magicNumber(100);
        guess(k, number);
    }

    private static void guess(int k, int computerNumber) {
        int userTryGuess = 0;
        int answer = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= k; i++) {
            System.out.println("Try to guess my number!");
            userTryGuess = input.nextInt();
            if (userTryGuess == computerNumber) {
                System.out.println("Yes you are right!");
                answer = 1;
                break;
            } else if (userTryGuess < computerNumber) {
                System.out.println("The magic number is bigger then yours");
            } else {
                System.out.println("The magic number is less then yours");
            }
        }
        if(answer !=1){
            System.out.println("Your tries are over, try next time!");
        }
    }

    private static int magicNumber(int range) {
        int number = (int) (Math.random() * ((range - 1) + 1)) + 1;
        System.out.println(number);
        return number;
    }

    private static int tryAndCry() {
        int k = 0;
        System.out.println("What level do you prefer?" +
                "Easy(1)? Or for adults(2) Please enter 1 or 2?");
        Scanner input = new Scanner(System.in);
        int userGamek = input.nextInt();
        if (userGamek == 1) {
            k = 10;
        } else k = 5;
        return k;
    }
}

