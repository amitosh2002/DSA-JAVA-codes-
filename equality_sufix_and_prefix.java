// check if we can partition the array into two subarray with equal sum. 
//More formally , check that the prefix sum is a part of the array is equal to the sufix of the array
// approach----  totalSum = prefixSum + sufixSum


import java.util.*;

public class equality_sufix_and_prefix {

    static void print(int[] arr) {
        System.out.println("Array element are: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    static int totalSumArray(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;

    }

    static boolean equality(int[] arr) {

        int prefix = 0;
        int totalSum = totalSumArray(arr);

        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int suffix = totalSum - prefix;

            if (suffix == prefix) {

                return true;
            }
        }
        return false;
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

        print(arr);
        System.out.println(equality(arr));
    }
}
