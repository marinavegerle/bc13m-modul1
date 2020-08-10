package HomeWork;

import java.util.Arrays;

public class ArrayHW {
    public static void main(String[] args) {


        // Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
        // the elements from a followed by the elements from b.The arrays may be any length, including 0,
        //  but there will be 2 or more elements available between the 2 arrays.
        int[] ab1 = new int[]{4, 5};
        int[] ab2 = new int[]{1, 2, 3};
        int[] ab3 = new int[]{4};
        int[] ab4 = new int[]{1, 2, 3};
        int[] ab5 = new int[]{};
        int[] ab6 = new int[]{1, 2};
        System.out.println(Arrays.toString(make2(ab1, ab2))); //→ [4, 5]
        System.out.println(Arrays.toString(make2(ab3, ab4))); //→ [4, 1]
        System.out.println(Arrays.toString(make2(ab5, ab6))); //→ [1, 2]

        //  Given an array of ints of odd length, look at the first, last,
        //and middle values in the array and return the largest.The array length will be a least 1.
       /* int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 5, 3};
        int[] a3 = new int[]{5, 2, 3};
        System.out.println(maxTriple(a1));// →3
        System.out.println(maxTriple(a2));// →5
        System.out.println(maxTriple(a3));// →5*/

        // Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
        int[] b1 = new int[]{3};
        int[] b2 = new int[]{1};
        int[] b3 = new int[]{4};
        System.out.println(Arrays.toString(makePi()));
        ; //→ [3, 1, 4]

        // Given an array of ints length 3, return an array with the elements "rotated left"
        //so {1, 2, 3} yields {2, 3, 1}.
        int[] bc1 = new int[]{1, 2, 3};
        int[] bc2 = new int[]{5, 11, 9,};
        int[] bc3 = new int[]{7, 0, 0};
        System.out.println(Arrays.toString(rotateLeft3(bc1))); // → [2, 3, 1]
        System.out.println(Arrays.toString(rotateLeft3(bc2))); // → [11, 9, 5]
        System.out.println(Arrays.toString(rotateLeft3(bc3))); // → [0, 0, 7]

    }

    private static int[] rotateLeft3(int[] array) {
        int[]output = new int[3];
        output[0] = array[1];
        output[1] = array[2];
        output[output.length-1]=array[0];
        return output;
    }

    private static int[] makePi() {
       // int[] Pi = new int[]{3,1,4};
        double pi = 3.14;
        String word = String.valueOf(pi);
        System.out.println(word);
        int[] output = new int[word.length()-1];
        output[0] = Integer.parseInt(word.substring(0,1));
        output[1] = Integer.parseInt(word.substring(2,3));
        output[2] = Integer.parseInt(word.substring(3));
        return output;

    }

    private static int maxTriple(int[] input) {
        int output = 0;
        int i = 0;
        while (i < input.length) {
            i++;
        }
        return output;
    }

    private static int[] make2(int[] ab1, int[] ab2) {
        int[] output = new int[2];

        return null;
    }


}
