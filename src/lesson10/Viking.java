package lesson10;

public class Viking {
    public static void main(String[] args) {
        System.out.println(waysOfVikingOne("On the left"));
        System.out.println(waysOfVikingOne("On the right"));
        System.out.println(waysOfVikingOne("Straight"));
        System.out.println(waysOfVikingOne("Down"));

    }

    public static String waysOfVikingOne(String way) {
        String result = "";
        switch (way){
            case("on the left"):
                result = "You will lose your horse";
                break;
            case ("On the right"):
                result = "Death";
                break;
            case ("Straight"):
                result = "You will find the happiness";
                break;
            default:
                result ="Choice is not clear";
                break;
        }


        return result;
    }
}


