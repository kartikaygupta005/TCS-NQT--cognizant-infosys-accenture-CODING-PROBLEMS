import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 != len2) {
            System.out.print(false);
            return;
        }

        int i = 0;

        while (i < len1) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
            i++;
        }

        int j = 0;
        boolean bool = true;

        while (j < len2) {
            if (!map.containsKey(str2.charAt(j))) {
                bool = false;
                break;
            } else {
                map.put(str2.charAt(j), map.get(str2.charAt(j)) - 1);

                if (map.get(str2.charAt(j)) == 0) {
                    map.remove(str2.charAt(j));
                }
            }

            j++;
        }

        System.out.print(bool);
    }
}
