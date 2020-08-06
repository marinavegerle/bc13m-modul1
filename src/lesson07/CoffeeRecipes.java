package lesson07;

public class CoffeeRecipes {
    public static void main(String[] args) {
        latte();
        cappuccino();
        americano();
        hotWatter();
    }

    public static void latte() {

        System.out.println("------------------");
        System.out.println("Your drink is ready");
        milk(40);
        coffee(30);
        water(70);
        System.out.println("----------------------");

    }

    public static void cappuccino() {
        System.out.println("------------------");
        System.out.println("Your drink is ready");
        milk(30);
        coffee(40);
        water(20);
        System.out.println("----------------------");

    }

    public static void hotWatter() {
        System.out.println("------------------");
        System.out.println("Hotwatter  is ready");
        //milk(0);
        //  coffee(0);
        water(100);
        System.out.println("----------------------");
    }
    public static void americano(){
        System.out.println("------------------");
        System.out.println("Your drink is ready");
        milk(0);
        coffee(40);
        water(50);
        System.out.println("----------------------");

    }


    public static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }

    public static void water(int ml) {
        System.out.printf("Added %d ml of water \n", ml);

    }

    public static void coffee(int mg) {
        System.out.printf("Added %d mg of coffee \n", mg);
    }
}
