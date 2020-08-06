package lesson10;

public class HomeWorkIfElse07 {
    public static void main(String[] args) {
        split();
        System.out.println(speedLimits(46));
        System.out.println(speedLimits(56));
        System.out.println(speedLimits(80));
        System.out.println(speedLimits(120));
        split();

    }

    public static void split() {
        System.out.println("-------------------");
    }


    public static String speedLimits(int speed) {
        String result = "";
        if (speed <= 50) {
            return "No offence";
        } else if (speed <= 65) {
            return "Punishment by words of policeman";
        } else if (speed <= 100) {
            return "40.00 EUR Penalty";
        } else if (speed <= 130) {
            return "500.00 EUR Penalty";
        } else {
            return "1000 EUR Penalty";
        }

    }

}

















