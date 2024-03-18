import java.util.*;

public class sumOfAllElements {
    public static void main(String[] args) {
        int arr[] = {23,45,62,63,65,67,80,90,34,57,66,108};

        int n = arr.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }

        System.out.println("Sum of all elements " + sum);
    
    }
}
