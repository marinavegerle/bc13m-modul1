package lesson11;

public class Logic01 {
    public static void main(String[] args) {
        /*System.out.println(smartDepositBox(true, false));//true
        System.out.println(smartDepositBox(false, true));//true
        System.out.println(smartDepositBox(false, false));//false
        System.out.println("----------------------");
        System.out.println(smartDepositTwo(true, false));
        System.out.println(smartDepositTwo(false, true));
        System.out.println(smartDepositTwo(false, false));
        System.out.println(smartDepositTwo(true, true));
        System.out.println("-----------------------");
        System.out.println(bigBadaBoom(true, true));//true
        System.out.println(bigBadaBoom(false, false));//false
        System.out.println(bigBadaBoom(true, false));//false
        System.out.println("-----------------------");
        System.out.println(verySmartDepositBox(true, true, false));*/
        System.out.println(doorBell(true, true));
        System.out.println(doorBell(false, false));
        System.out.println(doorBell(true, false));
    }

    public static boolean smartDepositBox(boolean mamaTouch, boolean papaTouch) {
        //return mamaTouch || papaTouch;
        if (mamaTouch || papaTouch) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean smartDepositTwo ( boolean mamaTouch, boolean papaTouch){
        return mamaTouch && papaTouch;
    }
    public static boolean bigBadaBoom (boolean captain01, boolean captain02){
        return captain01 && captain02;
    }
    public static boolean verySmartDepositBox (boolean mamaPermission, boolean papaPermission,
                                               boolean omaPermission){
        //return mamaPermission && papaPermission || omaPermission;
        return omaPermission || smartDepositTwo(mamaPermission,papaPermission);
    }
    public static boolean doorBell (boolean bell1, boolean bell2){
        return bell1 ^ bell2;
    }


}
