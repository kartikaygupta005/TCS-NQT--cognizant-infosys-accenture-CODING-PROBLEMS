import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int productno = sc.nextInt();
            int id = sc.nextInt();
            int qty = sc.nextInt();

            if (map.containsKey(id)) {
                System.out.println(productno + ":" + id + ":" + qty);
            } else {
                map.put(id, productno + ":" + id + ":" + qty);
            }
        }
    }
}
