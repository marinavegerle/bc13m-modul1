package lesson07;

public class HelloIfElse {
    public static void main(String[] args) {
        int customerAge = 15;
        alcoholPermissionTwo(40);
        alcoholPermissionTwo(37);
        alcoholPermissionTwo(21);
        alcoholPermissionTwo(29);
        alcoholPermissionTwo(5);

    }
    public static void alcoholPermissionTwo(int age){
        if (age<16) {
            System.out.println("Alcohol selling is not possible");
        }else if ( age < 18){
            System.out.println("Selling not strong alcohol drinks is possible");
        }else{
            System.out.println("Alcohol selling is possible");
        }
    }

    public static void helloIf (){
        boolean permission = true;
        if (true){
            System.out.println("I am going to the camp");
        } else {
            System.out.println("I will stay at home");
        }
    }
}
