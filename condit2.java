import java.util.*;

public class condit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int min_fullframe = sc.nextInt();
        int min_halfframe = sc.nextInt();
        int min_frameless = sc.nextInt();

        if(amount >= min_halfframe){
            System.out.println("buy full frAME");
        }
        else if(amount >= min_halfframe){
            System.out.println("Buy half frame");
        }
        else if(amount >= min_frameless){
            System.out.println("Buy frameless");
        }
    }
}
