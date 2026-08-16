import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        int initial = 0;
        int next = 1;

        for (int i = 0; i < range; i++) {
            System.out.print(initial + " ");

            int sum = initial + next;
            initial = next;
            next = sum;
        }
    }
}
