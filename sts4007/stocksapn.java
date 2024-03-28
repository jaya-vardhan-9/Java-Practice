package sts4007;

import java.util.*;


public class stocksapn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int stock[] = new int[n];
        for(int i=0;i<n;i++){
            stock[i]=sc.nextInt();
        }

        int span[] = new int[n];

        span[0] = 1;

        for(int i=1;i<n;i++){
            span[i]=1;
            for(int j=i-1;(j>=0) && (stock[i] >= stock[j]) ; j--){
                span[i]++;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(span[i]);
        }


    }
    
}
