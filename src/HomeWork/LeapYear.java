package HomeWork;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(findSimpleYear(1999));

    }

    public static boolean findSimpleYear(int year) {
        return year % 4 == 0;
    }


}
