import java.util.*;

public class condit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int obt_mark = sc.nextInt();
        int req_mark = sc.nextInt();

        if (obt_mark >= req_mark) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}