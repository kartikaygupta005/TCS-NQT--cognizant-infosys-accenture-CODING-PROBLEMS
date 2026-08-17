import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }

            else if (ch == '}' || ch == ']' || ch == ')') {

                if (stack.isEmpty()) {
                    break;
                }

                if ((ch == ')' && stack.peek() == '(') ||
                    (ch == '}' && stack.peek() == '{') ||
                    (ch == ']' && stack.peek() == '[')) {

                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }
}
