import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine(); 
        int len = word.length() ; 
        int count = 0 ;
        word= word.toLowerCase();
        for(int i = 0 ; i < len ; i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'o' || word.charAt(i) == 'i' ||  word.charAt(i) == 'u' ){
                count++;
            }
        }
        System.out.print(count);
    }
}
