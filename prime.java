import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean prime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.print("prime");
        } else {
            System.out.print("not prime");
        }
    }
}
