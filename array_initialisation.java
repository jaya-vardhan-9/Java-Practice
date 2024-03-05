import java.util.* ;

/**
 * array_initialisation
 */
public class array_initialisation {

    public static void main(String[] args) {
        int [] arr = new int [5] ;
        Scanner sc = new Scanner(System.in) ;

        int len = arr.length ;
        
        for(int i =0; i < len; i ++) {
            arr[i] = sc.nextInt();
        }

        /*Printing the elements of array */
        for (int i =0; i< len; i++){
            System.out.println(arr[i] + "");
        }
        /* We cvannot use  System.out.println(arr[i]) coz it returns
         * the memory address of the stored array
        */

        /* sorting of the array */
        Arrays.sort(arr);
        System.out.println("Sorted array");
        for(int i=0; i<len; i++){
            System.out.println(arr[i] + "");
        }

        /*Binary search  */
        System.out.print("Enter element to be searched");
        int ele = sc.nextInt();
        System.out.println(Arrays.binarySearch(arr, ele));

    }
}
