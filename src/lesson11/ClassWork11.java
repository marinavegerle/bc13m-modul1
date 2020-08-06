package lesson11;

public class ClassWork11 {
    public static void main(String[] args) {
      /*  System.out.println(mixStart("mix snacks")); // true
        System.out.println(mixStart("pix snacks"));// true
        System.out.println(mixStart("piz snacks"));// false*/
       /* System.out.println(close10(8, 13));//8
        System.out.println(close10(13, 8));//8
        System.out.println(close10(13, 7));//0*/
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));

    }
    public static boolean mixStart(String str){
        String start = str.substring(1,3);
        return str.substring(1,3).equals("ix");

    }
    public static int close10 (int one, int two){
        int difference1 = Math.abs(one - 10);
        int difference2 = Math.abs(two - 10);

        if (difference1<difference2){
            return one;
        } else if (difference1 > difference2){
            return two;
        } else return 0;

    }
    public static boolean monkeyTrouble (boolean aSmile, boolean bSmile){

        return aSmile == bSmile;
    }
}
