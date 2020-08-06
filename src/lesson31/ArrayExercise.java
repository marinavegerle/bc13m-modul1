package lesson31;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 3};
        int[] a3 = new int[]{7, 3, 2};
        int[] a4 = new int[]{1, 3};
        System.out.println(commonEnd(a1, a2));//true
        System.out.println(commonEnd(a1, a3));//false
        System.out.println(commonEnd(a1, a4));//true

        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{5, 11, 9};
        int[] b3 = new int[]{7, 0, 0};
        reverse3(b1);
        System.out.println(reverse3(b2));
        reverse3(b3);// → [0, 0, 7]

    }
    public static int[] reverse3(int[] b){
       /*for (int i = 0; i <b.length ; i++) {

        }*/

        return null;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}

