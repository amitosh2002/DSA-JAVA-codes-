/*
 * Given square matrix ,turn it 90 degree in a clockwise direction
 * Algo- first take transpose then reverse each row to get ans
 *  1 2 3
 *  4 5 6
 *  7 8 9
 * ------------
 *  taking transpose
 * 
 * 1 4 7 
 * 2 5 8
 * 3 6 9
 * -----------------
 * reverse each row -- arr[i] here i represent row of matrix so we simpply reverse the rows
 * 
 * 
 * Answer array -
 * 
 * 7 4 1
 * 8 5 2 
 * 9 6 3
 * 
 * 
 * 
 */

import java.util.Scanner;

public class rotate_matrix {

    static void printArray(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(arr[i][j] + " ");
                System.out.print(" ");
            }
            System.out.println(" ");

        }
    }

    static void transposeInPlace(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseArray(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }

    static void rotate_90_degree(int[][] arr, int n) {
        transposeInPlace(arr, n, n);
        for (int i = 0; i < n; i++) {
            reverseArray(arr[i]);

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r, c;
        System.out.println("Enter the number of row:");
        r = sc.nextInt();
        System.out.println("Enter the number of column:");
        c = sc.nextInt();

        int[][] martix = new int[r][c];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                martix[i][j] = sc.nextInt();
            }

        }

        printArray(martix, r, c);
        rotate_90_degree(martix, r);
        printArray(martix, r, c);
        sc.close();

    }
}
