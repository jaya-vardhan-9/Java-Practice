/* the maximum difference between elements in an array is the difference between first and last element of an array
 * for an unsorted array make it sorted usig arrays.sort
 * and apply absolute difference
 */

import java.util.*;
public class Max_difference {
    public static void main(String[] args) {
        int arr[] = {23,45,62,63,65,67,80,90,34,57,66,108};
        int n= arr.length;
        
        Arrays.sort(arr);
        int z = Math.abs(arr[0]-arr[n-1]);
        System.out.println("Max difference "+z);

    }
}
