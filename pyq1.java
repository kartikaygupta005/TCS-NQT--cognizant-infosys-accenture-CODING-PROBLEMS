/*Problem Description
A logistics system tracks target order numbers set at every hour of the day.
 You are given an integer N representing total hours, followed by an array targets of size N, where targets[i] represents the target order set at hour i.Due to database sync issues, target numbers from earlier hours repeat in later hours. For every target number that repeats in the array:Track its occurrence count on the left side as you move left to right (1 for 1st time, 2 for 2nd time, 3 for 3rd time, etc.). 

Calculate and print the total sum of these occurrence counts for all repeating target numbers.

Input Format
Line 1: An integer N representing total hours. Line 2: N space-separated integers representing targets[0], targets[1], ..., targets[N-1].

Output Format
Print a single integer representing the sum of occurrence counts.

Test Case 1.
5
1 2 2 3 3   ----> for 2     we will calculate as  1(for first occurance of 2+ + 2 (for 2nd Occurance)
			    i.e.  1+2 (sum of natural numbers)= 2*(2+1)/2=3

output 6

2 repeated 2 times
3 repeated 2 times

ans 2*(2+1)/2  +  2*(2+1)/2 = 6

Test Case 2:
6
4 4 5 5 6 6
output 9

*/

import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
public class main{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] targets = new int[N];
        for(int i = 0 ; i < N ; i++) {
            target[i] = sc.nextInt();
        }
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int i = 0 ; i < N ; i++){
            map.put(targets[i] , map.getOrDefault(targets[i] , 0 )+1);
        }
        int repeatSum = 0 ;
        for(int count : map.values()){
            repeatSum += count*(count+1)/2;
        }
        System.out.print(repeatSum);


        }
    }
}
