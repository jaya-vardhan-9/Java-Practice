

import java.util.*;


public class evenoddsegre {

    public static void evenOddSegregation(int[] arr) {
        int[] evenArr = new int[arr.length];
        int[] oddArr = new int[arr.length];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex] = arr[i];
                evenIndex++;
            } else {
                oddArr[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        System.arraycopy(oddArr, 0, evenArr, evenIndex, oddIndex);

        System.arraycopy(evenArr, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {17, 15, 8, 12, 10, 5, 4, 1, 7, 6};

        evenOddSegregation(arr);

        System.out.println("Array after even-odd segregation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
       
    }
}
