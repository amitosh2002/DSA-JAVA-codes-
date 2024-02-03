import java.util.*;

// given an integer array "arr" ,return the prefix sum / running sum in the same array without creating a  new array 

// prefix sum = contineous sum from staring index to current index
// index 3 prefix sum = sum of index 0 + index 1 + index 2+ index 3 ;

class prefix_sum {

    static void print(int[] arr) {
        System.out.println("Answer array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    static void prefix(int[] arr) {
        // initilizing the value of sum
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            // storing the element value in sum variable
            sum += arr[i];
            // changing the value of array with the prefix sum value
            arr[i] = sum;

        }

    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println(" Element" + i + ":");
            arr[i] = sc.nextInt();

        }

        print(arr);
        prefix(arr);
        System.out.println("after sum:");
        print(arr);

    }

}