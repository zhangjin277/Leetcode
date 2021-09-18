import java.util.Arrays;

/**
 * MIT Algorithms
 * 
 * Implement insertion sort.
 */
public class InsertionSort {
    public static void main(String args []) {
        System.out.println("Hello, world!");
        int[] a = {5,2,4,6,1,3};
        InsertionSort.sort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void sort(int[] a) {
        int i = 0;
        for(int j = 1; j < a.length; j++) {
            int key = a[j];
            i = j - 1;
            // insert a[j] to sorted subarray a[0....i]. when key < a[i], keep iterating. when i == -1, 
            while(i >= 0 && key < a[i]) {
                a[i+1] = a[i];
                i = i-1;
            }
            // position i+1 is insertion position as key > a[i] jumps out of loop
            a[i+1] = key;
        }
    }
}
