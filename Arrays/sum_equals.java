import java.util.*;

class sum_equals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {23,45,62,63,65,67,80,90,34,57,66,108};
        int n = arr.length;
        
        int k = sc.nextInt();
        boolean b1 = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == k){
                    b1 = true;
                    break;
                }
            }
            if(b1){
                break;
            }
        }
        if(b1){
            System.out.println("Array has two elements with given sum "+k);
        }
        else{
            System.out.println("Array doesn't have two elements with given sum "+k);
        }
        
    }
}