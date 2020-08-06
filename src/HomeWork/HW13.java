package HomeWork;

public class HW13 {
    public static void main(String[] args) {
        // findDigits();
      // int test1 = 15;
      //  System.out.println(" Check " + test1 + " and we have " + primeNumberOne(test1));
         // primeNumberTwo(500);
       // listMePleasePrimeNumber(500);
        listMeEvenNumber(45);

    }
    public static void listMeEvenNumber (int range){
        for (int i = 0; i < range ; i++) {
            if(findEvenNumber(i)){
                System.out.println(i);
            }

        }
    }
    public static boolean findEvenNumber (int number){
        return number % 2 ==0;

    }


    public static void listMePleasePrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (true) {
                System.out.println(i);
            }

        }
    }


    public static boolean primeNumberOne(int n) {
        for (int i = 2; i < 10; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeNumberTwo(int range) {
        for (int i = 2; i < range; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) count++;

            }
            if (count < 2) {
                System.out.println(i);
            }
        }

    }


    public static void findDigits() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }

        }

    }
}










