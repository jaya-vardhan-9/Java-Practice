

import java.util.*;

class diagonal_elements_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        
        int sum = 0;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
                if(i==j){
                    sum = sum+arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
