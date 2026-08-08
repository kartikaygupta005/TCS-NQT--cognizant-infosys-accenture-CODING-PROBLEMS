import java.util.*;

public class ChoclateFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        Arrays.fill(ans, 0);

        int index = 0;

        // Put all non-zero elements first
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                ans[index] = arr[i];
                index++;
            }
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
