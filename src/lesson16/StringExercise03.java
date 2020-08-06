package lesson16;

public class StringExercise03 {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
        System.out.println("--------------------------");
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
        System.out.println("---------------------------");
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));

    }

    public static String middleThree(String s) {
        int middle = s.length() / 2;
        return s.substring(middle - 1, middle + 2);
    }

    public static String lastChars(String a, String b) {
        if (a.length() < 1) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public static String seeColor(String s) {
        String red = "red";
        String blue = "blue";
        if (s.substring(0, 3).equals(red)) {
            return red;
        } else if (s.substring(0, 4).equals(blue)) {
            return blue;
        } else return "";
    }
}
