package HomeWork;

public class HomeWork02and03 {

    public static void main(String[] args) {
        findRectanglesVariable();
        findCubesVariables();
        findRatioBetweenSquareBelorusToSquareUkraine();
        findDifferenceBetweenSquaresOfMoscowAndBerlin();
        euroToDollar();

    }
    public static void findRectanglesVariable (){
        int a = 4;
        int b = 6;
        int squareOfRectangle = a * b;
        int perimeterOfRectangle = 2 * (a + b);
        System.out.println("Square of Rectangle is = " + squareOfRectangle);
        System.out.println("Perimeter of Rectangle is = " + perimeterOfRectangle);
    }

    public static void findCubesVariables (){
        int c = 5;
        int squareOfCube = 6 * c * c;
        int perimeterOfCube = 12 * c;
        System.out.println("Square of Cube is = " + squareOfCube);
        System.out.println("Perimeter of Cube is = " + perimeterOfCube);

    }

    public static void findRatioBetweenSquareBelorusToSquareUkraine (){
        double squareBelorus = 207600;
        double squareUkraine = 603549;
        double theResult = Math.pow(squareUkraine, squareBelorus);
        System.out.println(theResult);

    }

    public static void findDifferenceBetweenSquaresOfMoscowAndBerlin(){
        double squareMoscow = 2511;
        double squareBerlin = 891.8;
        double theDifference = squareMoscow / squareBerlin;
        System.out.println("Square of Moscow is more square of Berlin = " + theDifference);

    }
    public static void euroToDollar () {
        int countEuro = 100;
        double cursEuroToDollar = 1.1;
        double resultDollar = countEuro / cursEuroToDollar;
        System.out.println(resultDollar);

    }

}
