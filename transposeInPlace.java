import java.util.Scanner;

/**
 * transposeInPlace
 */
public class transposeInPlace {

    static void printArray(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(arr[i][j] + " ");
                System.out.println("");
            }
            System.out.println(" ");

        }
    }

    static void transpose(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
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
        transpose(martix, r, c);
        printArray(martix, r, c);

    }

}