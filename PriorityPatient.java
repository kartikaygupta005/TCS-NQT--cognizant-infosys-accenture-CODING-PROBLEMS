import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] patientId = new int[n];

        for (int i = 0; i < n; i++) {
            patientId[i] = sc.nextInt();
        }

        int[] priority = new int[n];

        for (int i = 0; i < n; i++) {
            priority[i] = sc.nextInt();
        }

        // Copy of original priority
        int[] copy = Arrays.copyOf(priority, n);

        // Sort priorities in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (copy[i] > copy[j]) {
                    int temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }

        // Find patient according to sorted priority
        for (int i = 0; i < n; i++) {
            int id = hospital(priority, copy[i], n);
            System.out.print(patientId[id] + " ");
        }
    }

    private static int hospital(int[] priority, int target, int n) {

        for (int i = 0; i < n; i++) {
            if (priority[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
