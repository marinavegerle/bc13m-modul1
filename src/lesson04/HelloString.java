package lesson04;

public class HelloString {
    public static void main(String[] args) {
        gutenTagString();
        myLovelyCharAndString();
    }
    public static void gutenTagString (){
        String firstName = "Marina";
        String secondName = "Vegerle";
        char copyright = '\u00A9';
        int age = 31;
        System.out.println(" Welcome " + firstName + " " + secondName + " "+ age + " " + copyright);
        String studentNumberOne = firstName + " " + secondName + " " + copyright;
        System.out.println(" First student who registered on our website " + studentNumberOne);

    }
    public static void myLovelyCharAndString(){
        char numberOne = ' ';
        String numberTwo = "        ";
        String firstName = "Marina";
        String secondName = "Vegerle";
        char copyright = '\u00A9';
        String studentNumberOne = firstName + " " + secondName + " " + copyright;
        int dlina;
        dlina = studentNumberOne.length();
        System.out.println("how long ? " + dlina);
        String myVeryNewString = studentNumberOne.substring(10);
        System.out.println(myVeryNewString);
        myVeryNewString = studentNumberOne.substring(3,8);
        System.out.println(myVeryNewString);

    }
}
