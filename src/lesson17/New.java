package lesson17;

public class New {
    public static void main(String[] args) {
        //  mySimpleWhile();
        //   System.out.println("-------------");
        //   mySimpleFor();
        // System.out.println("-------------");
        //  mySimpleDoWhile();
        // System.out.println("--------------");
        //  myNotSimpleWhile();
        //  myMethod(10);

    }

    public static void myMethod(int b) {
        for (int i = 0; i < b; i += 2) {
            System.out.println(i);
        }
    }

    private static void myNotSimpleWhile() {
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 20) {
                break;
            }
        }
    }

    private static void mySimpleDoWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 0);
    }



    private static void mySimpleWhile() {
        int i = 0;
        while (i < 20) {
            System.out.println(i);
            i++;
        }
    }

    private static void mySimpleFor() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}


