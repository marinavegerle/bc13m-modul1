package lesson04;

public class HelloChar {

    public static void main(String[] args) {
        goodMorningChar();

    }

    public static void goodMorningChar (){
        char c;
        c = 1000;
        System.out.println("Everything is clear = " + c);
        char anotherChar = '\u0440';
        System.out.println(anotherChar);

        char abc = 'A';
        System.out.println("abc = " + abc);
        char euro = '€';
        char copyright = '©';
        char tm = '™';
        System.out.println(tm);
        char specialSymbolTabulator = '\t';
        System.out.println("" + euro + copyright + specialSymbolTabulator + abc);

    }
}
