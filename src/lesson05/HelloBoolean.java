package lesson05;

public class HelloBoolean {

    public static void main(String[] args) {
        int a = 1, b = 2;
        boolean bool = a <=b;
        System.out.println(bool);
        boolean anotherBool = !bool;
        System.out.println(anotherBool);

        //a & b
        boolean sun = true;
        boolean papa = false;
        boolean ice = sun&papa;
        System.out.println("Ice cream " + ice);

        // a | b
        boolean mama = true;
        boolean papaa = true;
        boolean walking = mama | papaa;
        System.out.println("Walking in park " + walking);
    }

    public static void split (){

        System.out.println("--------------");
    }
}
