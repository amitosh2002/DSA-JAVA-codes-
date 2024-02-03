import java.util.*;

public class queries_prefix_sum {

    static void print(int[] arr) {
        System.out.println("Answer array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    static int[] prefix_sum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            arr[i] += arr[i - 1];

        }
        return arr;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            System.out.println(" Element" + i + ":");
            arr[i] = sc.nextInt();

        }

        print(arr);
        int[] pref = prefix_sum(arr);
        // prefix_sum(arr);
        System.out.println("Enter the number of querires:");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Ënter the range:");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r] - pref[l - 1];
            System.out.println("sum is " + ans);

        }

    }
}
