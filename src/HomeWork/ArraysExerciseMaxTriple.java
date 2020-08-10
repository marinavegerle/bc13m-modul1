package HomeWork;

public class ArraysExerciseMaxTriple {
    public static void main(String[] args) {
        //  Given an array of ints of odd length, look at the first, last,
        //and middle values in the array and return the largest.The array length will be a least 1.
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 5, 3};
        int[] a3 = new int[]{5, 7, 2, 8, 3};
        System.out.println(maxTriple(a1));// →3
        System.out.println(maxTriple(a2));// →5
        System.out.println(maxTriple(a3));// →5
    }

    private static int maxTriple(int[] input) {
        int result = input[0];
        int middle = input[input.length / 2];
        int end = input[input.length - 1];
       /* if (middle > result) {
            result = middle;
        }
        if (end > result) {
            result = end;
        }*/
        result = Math.max(result, middle);
        result = Math.max(result, end);
        return result;
    }
}
