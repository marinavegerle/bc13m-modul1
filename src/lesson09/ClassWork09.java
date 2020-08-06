package lesson09;

public class ClassWork09 {
    public static void main(String[] args) {
        int a = 7;
        int b = 15;
        System.out.println(findIntegers(a,b));
        System.out.println(addition(a,b));
        System.out.println(getStringMonth(a));
    }
    public static boolean findIntegers (int a, int b){

        return a >= 10 && a <= 21 || b >= 10 && b <= 21;
    }
    public static int addition (int a, int b){
       // int c = a + b;
        return a + b;
    }
    public static String getStringMonth (int month){
        String monthString = "";
        switch (month){
            case 1: monthString = "January";
                break;
            case 2 : monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default:
                monthString = "Invalid Month" + month;
                break;
        }

        return monthString;
    }
}
