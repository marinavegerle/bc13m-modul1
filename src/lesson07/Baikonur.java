package lesson07;

public class Baikonur {
    public static void main(String[] args) {
        double shuttleSpeedOne = 5.0;
        double shuttleSpeedTwo = 15.1;

        shuttleStart(shuttleSpeedOne);
        System.out.println("---------------------");
        shuttleStart(shuttleSpeedTwo);

    }
    public static void shuttleStart (double speed){
        final double SUPERCONSTANT_G = 10.0;
        //final double PI = 3.14;

        if (speed < SUPERCONSTANT_G){
            System.out.println("Первоначальное ускорение недостаточно");
            System.out.println("Ракета не может стартовать");
            System.out.println("Подготовить аварийные службы");
        } else {
            System.out.println("Ракета улетает в космос");
            System.out.println("Выпустить пресс-релиз об успешном запуске");
            System.out.println("Подготовить программистов к наградам");
        }



    }
}
