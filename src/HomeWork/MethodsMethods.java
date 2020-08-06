package HomeWork;

public class MethodsMethods {
    public static void main(String[] args) {
        // lowAndLow();
        // upupup();
        // cutandprint();
        // theTrimm();
        //howLong();
        // soEmpty();
        // containsOrNot();
        //theEndWithExample();
        caseIgnore();

    }
    public static boolean caseIgnore (){
        String d = "Welcome to Tel Ran";
        String e = "Tel Ran Java Class";
        String f = "tel ran java class";
        boolean var4 = e.equalsIgnoreCase(d);
        boolean var5 = e.equalsIgnoreCase(f);
        System.out.println("String e is equal to d " + var4);
        System.out.println("String e is equal to f " + var5);
        return false;
    }

    public static boolean theEndWithExample() {
        String string1 = "This is the End";
        String string2 = "This is beginning";
        boolean var1 = string1.endsWith("End");
        boolean var2 = string1.endsWith("beginning");
        boolean var3 = string2.endsWith("End");
        boolean var4 = string2.endsWith("beginning");
        System.out.println("string1 ends with the End = " + var1);
        System.out.println("string1 ends with the beginning = " + var2);
        System.out.println("string2 ends with the End = " + var3);
        System.out.println("string2 ends with the beginning = " + var4);
        return false;
    }

    public static boolean containsOrNot() {
        String one = "Java morning Class";
        boolean search = one.contains("morning");
        boolean search2 = one.contains("evening");
        System.out.println(search);
        System.out.println(search2);
        return false;
    }

    public static boolean soEmpty() {
        String c = "Hello";
        String c2 = "";
        System.out.println(c.isEmpty());
        System.out.println(c2.isEmpty());
        return false;
    }

    private static void howLong() {
        String a = "Berlin is the capital of Germany";
        System.out.println(a.length());
    }

    private static void theTrimm() {
        //trim example
        String s = "Welcome to Java Kurs";
        System.out.println(s.trim());
    }

    private static void cutandprint() {
        //substring() Example
        String onemorestr = "ich lerne programmieren";
        System.out.println(onemorestr.substring(0, 1).toUpperCase() + onemorestr.substring(1).toLowerCase());
    }

    private static void upupup() {
        //toUpperCase() Example
        String newstr = "Exercises make the master";
        System.out.println(newstr.toUpperCase());
    }

    private static void lowAndLow() {
        //toLowerCase() example
        String str = "GUTEN ABEND";
        System.out.println(str.toLowerCase());
    }
}


