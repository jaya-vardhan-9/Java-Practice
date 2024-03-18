
import java.util.*;

public class noOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int d = 0;

        if(n==0){
            d =1;
        }
        while(n!=0){
            n=n/10;
            d=d+1;
        }
        System.out.println(d);
        
    }
}
