import java.util.*;

class sum_of_elements_in_rows_and_col{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int[][] arr = new int[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            int sum =0;
            for(int j=0;j<col;j++){
                sum = sum+arr[i][j];
            }
            System.out.println("Sum of the row "+i+" = "+sum);
        }
        
        for(int i=0;i<col;i++){
            int sum =0;
            for(int j=0;j<row;j++){
                sum = sum+arr[j][i];
            }
        System.out.println("Sum of the column "+i+" = "+sum);
        }
    }
}
