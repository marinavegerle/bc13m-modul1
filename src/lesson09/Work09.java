package lesson09;

import java.sql.SQLOutput;

public class Work09 {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
    }
    public static boolean nearHundred(int digit) {
        int range = 10;
        //если разница 100
        return Math.abs(digit - 100) <= range || Math.abs(digit-200) <= range;

        }


    }


