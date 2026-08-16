import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int orignal = n;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        n = orignal;

        int armstrong = 0;

        while (n > 0) {
            armstrong += (int) Math.pow(n % 10, count);
            n = n / 10;
        }

        if (armstrong == orignal) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
