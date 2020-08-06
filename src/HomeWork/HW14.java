package HomeWork;

import com.sun.xml.internal.ws.message.stream.StreamHeader;

import static java.lang.String.valueOf;

public class HW14 {
    public static void main(String[] args) {
        doubleChar();
    }

     public static void doubleChar() {
        for (int i = 0; i <= 6; i*=2) {
            char char1 = (char) i;
            String str1 = String.valueOf(char1);
            System.out.print(repeatSymbol(str1, 7));
        }
    }

    public static String repeatSymbol(String symbol, int repeatNumber) {
        String output = "The";
        for (int i = 0; i < repeatNumber; i*=2) {
            output = output + symbol;
        }
        return output;
    }

}







