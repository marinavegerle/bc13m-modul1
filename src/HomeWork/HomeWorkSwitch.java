package HomeWork;

public class HomeWorkSwitch {
    public static void main(String[] args) {
        int customerAge1 = 10;
        int customerAge2 = 17;
        int customerAge3 = 18;
        int customerAge4 = 20;
        int customerAge5 = 30;
        System.out.println(customerAge(customerAge1));
        System.out.println(customerAge(customerAge2));
        System.out.println(customerAge(customerAge3));
        System.out.println(customerAge(customerAge4));
        System.out.println(customerAge(customerAge5));

        split();

        int seasonMonth = 10;
        String seasonString = "";
        switch (seasonMonth) {
            case 1:
                seasonString = "January - Winter";
                break;
            case 2:
                seasonString = "February - Winter";
                break;
            case 3:
                seasonString = "Spring";
                break;
            case 4:
                seasonString = "Spring";
                break;
            case 5:
                seasonString = "Spring";
                break;
            case 6:
                seasonString = "Summer";
                break;
            case 7:
                seasonString = "Summer";
                break;
            case 8:
                seasonString = "Summer";
                break;
            case 9:
                seasonString = "Autumn";
                break;
            case 10:
                seasonString = "Autumn";
                break;
            case 11:
                seasonString = "Autumn";
                break;
            case 12:
                seasonString = "Winter";
                break;
            default:
                seasonString = "Invalid Season - " + seasonMonth;
                break;
        }
        System.out.println(seasonString);
    }

    public static String customerAge(int customerAge) {
        String result = "";
        switch (customerAge) {
            case 10:
                result = "You are to young to buy alcohol, where are your parents!";
                break;
            case 17:
                result = "Selling Alcohol is not possible";
                break;
            case 18:
                result = "To sell alcohol is now possible";
                break;
            case 20:
                result = "To sell alcohol is now possible";
                break;
            case 30:
                result = "10 Euro to pay, have a good day!";
                break;
            default:
                System.out.println("Selling alcohol for you is not possible " + customerAge);
        }
        return result;
    }

    public static void split() {
        System.out.println("------------------");
    }


}
