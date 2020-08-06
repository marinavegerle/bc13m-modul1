package lesson13;

public class ForExercises {
    public static void main(String[] args) {
        // rectangle(7, 5);
        //  floydsTriangle(10);
        //  johnDo();
        //  multiplicationTable(10);
        mpGenerate(10);


    }

        private static void mpGenerate(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(digitForMp(i, j));
                }
                System.out.println("");
            }
        }
        public static String digitForMp(int a, int b) {
            if (a * b < 10) {
                return "  " + String.valueOf((a * b));
            } else if (a * b < 100) {
                return " " + String.valueOf((a * b));
            }
            return String.valueOf((a * b));
        }





    public static void rectangle(int a, int b) {
        String star = "*";
        String line = "";
        for (int i = 0; i < a; i++) {
            line = line + star;
        }

        for (int i = 0; i < b; i++) {
            System.out.println(line);
        }

    }

    public static void floydsTriangle(int n) {
        int number = 1;

        for (int i = 1; i < n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(number + " ");
                number = number + 1;
            }
            System.out.println("");
        }
    }

    public static void johnDo() {
        int rowIndex = 1;
        //Если x <= z необходимо использовать вложенные циклы
        //x <= y <= z
        //xyz = 36
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y < 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println(rowIndex + ") " + "x = " + x + ", y = " + y + ", z = " + z);
                        rowIndex++;
                    }

                }

            }
        }


    }

public static void multiplicationTable(int n){
        int firstnumber = 1;

    for (int i = 1; i <= 10; i++){
        for (int j = 1; j <=10 ; j++) {
           // System.out.print();


        }

    }

    }
}

