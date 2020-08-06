package lesson26;

public class StringBooleanExercises {
    public static void main(String[] args) {
//        System.out.println(countYZ("fez day"));// → 2
//        System.out.println(countYZ("day fez"));// → 2
//        System.out.println(countYZ("day fyyyz"));// → 2
//        System.out.println(countYZ("tel ran"));// → 0
//        System.out.println(countYZ("xyx xzy"));// → 1
//        System.out.println(countYZ("London is the capital of Great Britain"));// → 0
        /*System.out.println(gHappy("xxggxx"));// → true
        System.out.println(gHappy("xxgxx"));// → false
        System.out.println(gHappy("xxggyygxx"));// → false*/
       /* System.out.println(sameStarChar("xy*yzz")); //→ true
        System.out.println(sameStarChar("xy*zzz")); //→ false
        System.out.println(sameStarChar("*xa*az"));// → true*/

        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2
        System.out.println("--------------------");
        System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly"
    }

    private static String starOut(String input) {
        String output = "";
        char star = '*';
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == star && input.charAt(i - 1) != star) {
                output = input.substring(0, (i - 1)) + input.substring(i + 2);
            } else if (input.charAt(i) == star && input.charAt(i - 1) == star) {
                output = input.substring(0, (i - 2)) + input.substring(i + 2);
            }

            }
            return output;
        }


        private static int countHi (String s){
            int countWords = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i') countWords++;
            }
            return countWords;
        }


        private static boolean sameStarChar (String s){
            for (int i = 1; i < s.length() - 1; i++) {
                if (s.charAt(i) == '*' && s.charAt(i - 1) == s.charAt(i + 1))
                    return true;
            }
            return false;
        }

        private static boolean gHappy (String str){
            int count = 0;
            int allG = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'g') {
                    allG++;
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'g' && (str.charAt(i - 1) != 'g' || str.charAt(i + 1) != 'g')) {
                    count++;
                }
            }
            if (allG - count == allG) return true;
            return false;
        }


        private static int countYZ (String s){
            int wordsNumber = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == ' ' && (s.charAt(i - 1) == 'y' || s.charAt(i - 1) == 'z')) {
                    wordsNumber++;
                }
            }
            if (s.endsWith("y") || s.endsWith("z")) {
                wordsNumber++;
            }
            return wordsNumber;
        }
    }
