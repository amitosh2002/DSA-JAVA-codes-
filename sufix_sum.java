import java.util.Scanner;

public class sufix_sum {
    static void print(int[] arr) {
        System.out.println("Array element are: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    static int[] sufix(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i - 1] += arr[i];

        }
        return arr;
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Enter the size of the array :  ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the" + i + " element :");
            arr[i] = sc.nextInt();

        }

        int[] sufix = sufix(arr);
        print(sufix);

    }
}
