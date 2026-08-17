import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }

        System.out.println(stack);
    }
}
