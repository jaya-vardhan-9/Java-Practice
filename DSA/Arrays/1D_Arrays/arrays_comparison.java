import java.util.Arrays;

public class arrays_comparison {
    
    public static void main(String[] args) {
        
        /* Comparing two arrays */
        /* Use Arrays.equals(arr1, arr2) to compare arrays of primitive types */
        /*Arrays.deepEquals() method is used for comparing multidimensional arrays or arrays containing reference types (i.e., arrays of objects) */

        int arr1[] = { 1, 2, 3, 4, 5};
        int arr2[] = { 1, 2, 3, 4, 5};
        int arr3[] = { 3, 1, 1, 4, 5};

        System.out.println(Arrays.equals(arr1, arr2)); // true
        System.out.println(Arrays.equals(arr1, arr3)); // false
    }
}
