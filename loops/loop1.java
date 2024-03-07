package General Problems;
import java.util.*;
public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int i =1, count =0;
        while(distance == 0){
            if (i %5 == 0){
                count ++;
                i ++;
                distance --;
            }
        }
    System.out.println(count);

    }
    
}
