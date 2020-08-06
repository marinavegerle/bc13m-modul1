package lesson16;

public class StringExercise01 {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
        System.out.println(makeOutWord("<<>>", "Jay"));
        System.out.println(firstHalf("Woohoo"));
        System.out.println(nonStart("Hello", "there"));
        System.out.println(nonStart("java", "code"));
    }

    public static String nonStart(String a, String b){
        return a.substring(1,a.length())+ b.substring(1,b.length());
    }

    public static String firstHalf (String word){
        return word.substring(0,word.length()/2);
    }
    public static String helloName(String name) {
        String hello = "Hello ";
        String symbol = "!";
        char quotationMark = '"';
        String result = quotationMark + hello.concat(name + symbol) + quotationMark;
        return result;
    }

    public static String makeOutWord(String symbol, String word){
        String start = "";
       // symbol = symbol.substring(0,symbol.length()/2);
      //  System.out.println(symbol);

        return symbol.substring(0,symbol.length()/2)+word + symbol.substring(symbol.length()/2);
    }
}
