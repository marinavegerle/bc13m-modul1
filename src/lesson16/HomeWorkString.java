package lesson16;

public class HomeWorkString {
    public static void main(String[] args) {
        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
        System.out.println("----------------");
        System.out.println(withoutEnd2("Hello"));
        System.out.println(withoutEnd2("abc"));
        System.out.println(withoutEnd2("ab"));
        System.out.println("----------------");

    }

    public static String left2(String s) {
        return s.substring(2, s.length()) + s.substring(0, 2);
    }

    public static String withoutEnd2(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String nTwice(String a, int n) {
        return "";
    }
}



