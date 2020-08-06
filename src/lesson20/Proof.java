package lesson20;

public class Proof {
    public static void main(String[] args) {
        mySimpleMethod("test", 19);

    }

    private static void mySimpleMethod(String str, int digit) {
        if (digit <= 0) {
            for (int i = 0; i < digit; i++) {
                System.out.println(str);
            }
            System.out.println("Your variable is less then 0, please use another one");
        }
    }
}
