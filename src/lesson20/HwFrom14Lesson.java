package lesson20;

public class HwFrom14Lesson {
    public static void main(String[] args) {
       /* System.out.println(minCat("Hello", "Hi"));//"loHi"
        System.out.println(minCat("Hello", "java")); //"ellojava"
        System.out.println(minCat("java", "Hello"));//"javaello"
        System.out.println("-------------------");
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("Aabb"));
        System.out.println(doubleChar("Hi-There"));
        System.out.println("-------------------");*/
       /* System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));*/
        System.out.println(sumDigitString(123));
        System.out.println(sumDigitString(768));

    }
    private static int sumDigit (int number){
        String input = String.valueOf(number);
       int sum = 0;
       int length = input.length();
        for (int i = 0; i < length ; i++) {
            sum = sum + (number%10);
            number /= 10;
        }

        return sum;
    }

    private static int sumDigitString(int number) {
        String str = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String myLittleString = str.substring(i, i + 1);
            int myVeryLittleInt = Integer.parseInt(myLittleString);
            sum = sum + myVeryLittleInt;
        }
        return sum;
    }


    private static int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else if (c == a) {
            return b;
        }
        return a + b + c;
    }

    private static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }

    private static String minCat(String s1, String s2) {
        String output = "";
        if (s1.length() > s2.length()) {
            output = s1.substring(s1.length() - s2.length()) + s2;
        } else if (s2.length() > s1.length()) {
            output = s1 + s2.substring(s2.length() - s1.length());
        } else {
            output = s1 + s2;
        }
        return output;
    }
}