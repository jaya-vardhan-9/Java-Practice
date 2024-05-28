import java.util.*;

/*arraycopy(Object src, int srcPos, Object dest, int destPos, int length) */

public class Array_Roatation {

    public static int[] rotatearray(int arr[], int d){
        int n = arr.length;
        d = d%n; /*if any chance d is greater than n */
        int rot_array[] = new int[n];

        // System.arraycopy(arr,d,rot_array,0,n-d );
        // System.arraycopy(arr,0,rot_array,n-d,d);

        /*For right roatation */
        System.arraycopy(arr,n-d,rot_array,0,d);
        System.arraycopy(arr,0,rot_array,d,n-d);

        return rot_array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position you wnat to shift");
        int d = sc.nextInt();

        int rotated_array[] = rotatearray(arr,d);
        for(int i=0;i<rotated_array.length;i++){
            System.out.println(rotated_array[i]+" ");
        }

        }
 }

