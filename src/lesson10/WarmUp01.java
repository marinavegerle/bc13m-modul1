package lesson10;

public class WarmUp01 {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));//expecting true
        System.out.println(sleepIn(true, false));//expecting false
        System.out.println(sleepIn(false, true));//expecting true
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}

