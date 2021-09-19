import java.util.Arrays;

/**
 * MIT Algorithms
 * 
 * Implement insertion sort.
 */
public class InsertionSort {
    public static void main(String args []) {
        System.out.println("Hello, world!");
        int[] a1 = {5,2,4,6,1,3};
        InsertionSort.sort(a1);
        System.out.println(Arrays.toString(a1));

        int[] a2 = {31,41,59,26,41,58};
        //int[] a2 = {31,41};
        InsertionSort.sort1(a2);
        System.out.println(Arrays.toString(a2));
    }

    public static void sort(int[] a) {
        int i = 0;
        for(int j = 1; j < a.length; j++) {
            int key = a[j];
            i = j - 1;
            // insert a[j] to sorted subarray a[0....i]. when key < a[i], keep iterating. when i == -1, found 1st posotion in a[0....i] is the inserted position.
            while(i >= 0 && key < a[i]) {
                a[i+1] = a[i];
                i = i-1;
            }
            // position i+1 is insertion position as key > a[i] jumps out of loop
            a[i+1] = key;
        }
    }

    /**
     * Implement non-increasing sorted order.
     * 
     * @param a
     */
    public static void sort1(int[] a) {
        int i = 0;
        for(int j = 1; j < a.length; j++) {
            int key = a[j];
            i = j - 1;
            // a[0,i]   a[i+1...n]
            while(i >=0 && key >= a[i]) {
                a[i+1] = a[i];
                i = i -1;
            }
            a[i+1] = key;
        }
    }
}
