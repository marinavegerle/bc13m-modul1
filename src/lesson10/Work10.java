package lesson10;

public class Work10 {
    public static void main(String[] args) {
        String studentOne = "Dasha";
        String studentTwo = "Sasha";
        String studentThree = "Masha";
        String studentFour = "Glasha";
        String studentFive = "Misha";
        System.out.println(schoolNotes(studentOne));
        System.out.println(schoolNotes(studentTwo));
        System.out.println(schoolNotes(studentThree));
        System.out.println(schoolNotes(studentFour));
        System.out.println(schoolNotes(studentFive));

    }

    public static double schoolNotes(String name) {
        name = name.toLowerCase();
        double result = 0.0;
        switch (name){
            case "dasha":
                result = 5;
                break;
            case "sasha":
                result = 2;
                break;
            case "masha":
                result = 4;
                break;
            case "glasha":
                result = 4.5;
                break;
            case "misha":
                result = 3;
                break;
            default:
                result = 0.0;
        }


        return result;
    }

}
