package lesson16;

public class StringExercise04 {
    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("Hi"));
        System.out.println("--------------------------");
        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));
        System.out.println("---------------------------");
        System.out.println(makeAbba("hi", "by"));
        System.out.println(makeAbba("yo", "alize"));
        System.out.println(makeAbba("what", "up"));
        System.out.println("---------------------------");
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
        System.out.println("---------------------------");
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));
        System.out.println("--------------------------");

    }
    public static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String newString = str.substring(0, 2);
            return newString + newString + newString;
        }
    }
    public static String startWord(String s, String word) {
        return s.substring(0, word.length());
    }
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    public static String extraEnd(String a) {
        a = a.substring(a.length() - 2);
        return a + a + a;
    }
    public static String withoutEnd(String s){
        return s.substring(1,s.length()-1);
    }


    }

