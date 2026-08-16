import java.util.*;
public class main{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = "";
        for(int i = str.length()-1  ;  i >= 0 ; i-- ){
            reversed = reversed + str.charAt(i);
        }
        System.out.print(reversed);
    }
}
