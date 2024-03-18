/*this problem helps in findong the last digit of a given number 
 * 
 * logic is if we find (number%10) we can find the last digit
 * (number%100) we will find the last two digits
*/

import java.util.*;
public class lastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lastDigit = n%10;

        System.out.println("Last digit is "+ lastDigit);

    }
    
}
