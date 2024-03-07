
import java.util.*;
public class ascii_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isAlphabetic(ch)) {
            System.out.println("int:"+(int)ch);
            System.out.println("float:"+(float)ch);
            System.out.println("byte:"+(byte)ch);
            System.out.println("short:"+(short)ch);
        }
        else{
            System.out.println("Invalid");
        }
    }
    
}
