/* selection sort*/
import java.util.Scanner; 
import java.util.*;
public class SelectionSORT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;  i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n-1 ; i++){
            int minindex = i ;
            for(int j = i+1 ; j< n ; j++){
                if(arr[j] < arr[minindex])
                    minindex = j;
            }
            // swap the minimum element with first element
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp ;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
