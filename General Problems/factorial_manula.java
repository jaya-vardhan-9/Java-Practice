import java.util.*;

public class factorial_manula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long factorial = 1;
        
        if (n == 0 || n == 1) {
            factorial = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}