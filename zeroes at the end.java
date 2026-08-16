import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] newArr = new int[n];
        Arrays.fill(newArr, 0);

        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                newArr[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
