package lesson09;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println(findCurrencyCourse("EUR"));
        System.out.println(findTwoCurrencyCourse("BYN", "RUR"));
        System.out.println(findCurrencySum(100, "EUR","BYN"));
    }
    public static double findTwoCurrencyCourse(String firstCurrencyName, String secondCurrencyName){
        return findCurrencyCourse(firstCurrencyName) / findCurrencyCourse(secondCurrencyName) ;

    }
    public static double findCurrencySum(double amount, String inputName, String outputName){
       double currencySum = 0.0;
        return  findTwoCurrencyCourse(inputName, outputName);
    }

    public static double findCurrencyCourse(String currencyName){
        double currencyCourse = 0.0;
         switch (currencyName){
             case "EUR":
                 currencyCourse = 1.12;
                 break;
             case "RUR":
                 currencyCourse = 0.014;
                 break;
             case "USD":
                 currencyCourse = 1.0;
                 break;
             case "GPB":
                 currencyCourse = 1.25;
                 break;
             case "BYN":
                 currencyCourse = 0.41;
                 break;
             case "UAH":
                 currencyCourse = 0.03;
                 break;
             default:
                 currencyCourse = 0.0;
                 break;


         }


       return currencyCourse;

    }
}
