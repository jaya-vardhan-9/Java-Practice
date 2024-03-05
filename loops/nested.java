import java.util.*;
public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int os = sc.nextInt();
        int ram = sc.nextInt();

        if(os >=64) {
            if(ram >=8){
                System.out.println("Pubg or COD");
            }
            else{
                System.out.println("Farcry");
            }
        }
        else{
            System.out.println("Free fire");
        }
    }

    
}