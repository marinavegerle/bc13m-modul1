package HomeWork;

public class HW32 {
    public static void main(String[] args) {

        //Given an array of ints of odd length, return a new array length 3 containing the elements from
        // the middle of the array. The array length will be at least 3.
        int[] e1 = new int[]{1, 2, 3, 4, 5};
        int[] e2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] e3 = new int[]{1, 2, 3};
        myArrayPrint(midThree(e1));// → [2, 3, 4]
        myArrayPrint(midThree(e2));// → [7, 5, 3]
        myArrayPrint(midThree(e3));// → [1, 2, 3]

        //   Given an array of ints, return true if the array is length 1 or more,
        //   and the first element and the last element are equal.
        int[] f1 = new int[]{1, 2, 3};
        int[] f2 = new int[]{1, 2, 3, 1};
        int[] f3 = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(f1)); // → false
        System.out.println(sameFirstLast(f2)); //→ true
        System.out.println(sameFirstLast(f3));// → true

        // Given an array of ints length 3, return the sum of all the elements.
        int[] g1 = new int[]{1, 2, 3};
        int[] g2 = new int[]{5, 11, 2};
        int[] g3 = new int[]{7, 0, 0};
        System.out.println(sum3(g1));// → 6
        System.out.println(sum3(g2));// → 18
        System.out.println(sum3(g3));// → 7

       // We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
        // Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
        int[] h1 = new int[]{1,3,4,5};
        int[] h2 = new int[]{2, 1, 3, 4, 5};
        int[] h3 = new int[]{1, 1, 1};
        System.out.println(unlucky1(h1));// → true
        System.out.println(unlucky1(h1)); //→ true
        System.out.println(unlucky1(h3));; //→ false
    }
    public static boolean unlucky1(int[] input){

        return false;
    }

    public static int sum3(int[] array) {
        return array[0] + array[1] + array[2];
    }

    public static boolean sameFirstLast(int[] f) {
        return f[0] == f[f.length - 1];
    }

    public static int[] midThree(int[] array) {
        int[] output = new int[3];
        output[1] = array[array.length / 2];
        output[0] = array[array.length / 2 - 1];
        output[2] = array[array.length / 2 + 1];
        return output;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        System.out.println("Длина массива - " + arrayToPrint.length);
        for (int j : arrayToPrint) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

