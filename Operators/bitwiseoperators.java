import java.util.* ;

public class bitwiseoperators {
    public static void main (String [] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~ a);
        System.out.println(a >> b);
        System.out.println(a >> b);
        System.out.println(a << b);

    }
}
