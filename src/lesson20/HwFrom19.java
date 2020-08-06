package lesson20;

public class HwFrom19 {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));

    }
    private static boolean bobThere(String input) {
        char b = 'b';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == b && input.charAt(i + 2) == b) {
                return true;
            }
        }
        return false;
    }
}
