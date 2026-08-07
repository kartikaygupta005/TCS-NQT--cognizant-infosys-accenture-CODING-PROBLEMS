import java.util.*;
import java.util.Scanner ; 
public class ANAGRAM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length() != s2.length()){
            System.out.println("NO");
            return;
        }
        HashMap< Character , Integer > map = new HashMap<>();
        for( int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            map.put(ch , map.getOrDefault(s1.charAt(i) , 0 ) + 1 );
        }
        for(int i = 0 ;  i < s2.length() ; i++ ){
            char ch = s2.charAt(i);
            if(!map.containsKey(ch)){
                System.out.println("no");
                return ; 
            }
            map.put(ch , map.get(ch) - 1);
        }
        for(int count : map.values()){
            if( count != 0){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
