package lesson07;

public class CoffeeVending07 {
    public static void main(String[] args) {
        int customerChoiceOne = 11;
        int customerChoiceTwo = 12;
        int customerChoiceThree = 122;
        coffeeSwitch(11);
        split();
        coffeeSwitch(12);
        split();
        coffeeSwitch(122);
    }
    public static void split(){
        System.out.println("-------------------");
    }

    public static String coffeeSwitch(int customerValue) {
        String result = "";
        switch (customerValue) {
            case 11:
                CoffeeRecipes.americano();
                break;
            case 12:
                CoffeeRecipes.cappuccino();
                break;
            case 13:
                CoffeeRecipes.latte();
                break;
            case 14:
                CoffeeRecipes.hotWatter();
                break;
            default:
                System.out.println("Currently is out of service");
                break;
        }
        return result;
    }

    }


