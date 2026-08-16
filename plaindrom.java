import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orignal = n ;
        int check = 0 ;
        while(n > 0){
            int digit = n % 10;
            check = check*10 + digit ; 
            n = n/10; 
        }
        if(check == orignal){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
