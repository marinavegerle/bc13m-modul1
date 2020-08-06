package lesson06;

public class HelloSwitchCase {
    public static void main(String[] args) {
        int customerValue1 = 3;
        int customerValue2 = 5;
        int customerValue3 = 86;
        String fromCoffeeVendingMachine = coffeeVending(customerValue1);
        System.out.println(fromCoffeeVendingMachine);
        split();
        System.out.println(coffeeVending(customerValue2));
        split();
        System.out.println(coffeeVending(customerValue3));

    }
    public static void split(){
        System.out.println("------------------");
    }
    public static String coffeeVending(int customerValue) {
        String result = "";
        switch (customerValue) {
            case 41:
                result = "Coffee will be done";
                break;
            case 42:
                result = "Boiled water will be done";
                break;
            case 44:
                result = "Espresso will be done";
                break;
            case 77:
                result = "Cacao is done";
                break;
            case 86:
                result = "Water is boiling" + "\n" + "Coffee is in process" + "\n" + "Add milk"
                        + "\n" + "Mood is perfect";
                break;
            default:
                System.out.println("Please choose again: "
                        + customerValue + " " + "transaction now is not possible");
                break;

        }
        //System.out.println("Program is done without mistakes");
        return result;
    }
}


