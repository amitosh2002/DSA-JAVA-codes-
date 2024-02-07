/*
 * given an integer n return the first n rows of pascals triangle
 * Properties-
 * 1) it is jagged array (number of rows may varies in each row)
 * 2) first and last element in each row has value 1
 * 3) p[i][j]= p[i-1][j] + p[i-1][j-1]  --- concept of pascal triangle
 * 
 * outpur for n= 5
 *      1
 *      1 1
 *      1 2 1
 *      1 3 3 1
 *      1 4 6 4 1
 * 
 */

import java.util.Scanner;

public class PascalsTriangle {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + "  ");

            }
            System.out.println();
        }

    }

    static int[][] Pascals(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            // creatin a 1d array in each row
            // each row has i ith +1 coloumn
            ans[i] = new int[i + 1];
            // first and last value is always 1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {

                ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];

            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pascal value n :  ");
        int n = sc.nextInt();

        int ans[][] = Pascals(n);
        printMatrix(ans);
        sc.close();

    }

}
