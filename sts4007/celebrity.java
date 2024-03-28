import java.util.*;

public class celebrity {

    static int findceleb(Stack<Integer> s, int arr[][]) {
        while (s.size() > 1) {
            int j = s.pop();
            int k = s.pop();

            if (arr[k][j] == 1) {
                s.push(j);
            } else {
                s.push(k);
            }
        }
        int potentialCeleb = s.pop();

        for (int i = 0; i < arr.length; i++) {
            if (i != potentialCeleb && (arr[i][potentialCeleb] == 0 || arr[potentialCeleb][i] == 1)) {
                return -1;
            }
        }

        return potentialCeleb;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int[][] matrix = {
            {0, 1, 1, 0},
            {0, 0, 0, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };

        for (int i = 0; i < matrix.length; i++) {
            s.push(i);
        }

        System.out.println(findceleb(s, matrix));
    }
}