import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int product = 1;

        for (int i = n; i > 0; i--) {
            product *= i;
        }

        System.out.print(product);
    }
}
