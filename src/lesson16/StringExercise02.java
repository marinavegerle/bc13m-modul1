package lesson16;

public class StringExercise02 {
    public static void main(String[] args) {
        System.out.println(theEnd("hello", true));
        System.out.println(theEnd("hello", false));
        System.out.println(theEnd("oh", true));
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
    }

    public static String theEnd(String s, boolean front) {
        if (front) {
            return s.substring(0, 1);
        } else {
            return s.substring(s.length() - 1);
        }
    }

    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public static boolean endslyDos(String str) {
        String reference = "ly";
        int length = str.length();
        if (length < 2) {
            return false;
        }
        return reference.equals(str.substring(str.length() - 2));
    }
}







