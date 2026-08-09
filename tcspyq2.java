/*Hospital Patient Queue
Problem Statement

A hospital has N patients waiting for treatment. Each patient has a unique Patient ID and a corresponding Priority.

You are given two arrays:

patientId[] — contains the ID of each patient.
priority[] — contains the priority of each patient.

The priority of a patient is stored at the same index as their patient ID.

A smaller priority value means higher priority.

Patients should be treated according to the following rules:

Patients with higher priority are treated first.
If two or more patients have the same priority, they are treated in their original arrival order.

Print the patient IDs in the order in which they should be treated.

Input Format

The first line contains an integer N, representing the number of patients.

The second line contains N space-separated integers representing patientId[].

The third line contains N space-separated integers representing priority[].

Output Format

Print the patient IDs in the order in which they should be treated.

Constraints
1 ≤ N ≤ 10⁵
1 ≤ patientId[i] ≤ 10⁹
1 ≤ priority[i] ≤ 10⁹
Example

Input

5
101 102 103 104 105
3 1 2 1 3

The arrays represent:

Patient ID:  101  102  103  104  105
Priority:      3    1    2    1    3

Priority 1 has the highest priority.

Treatment order:

102 → priority 1
104 → priority 1
103 → priority 2
101 → priority 3
105 → priority 3

Therefore:

Output

102 104 103 101 105*/import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
public class main{
    public static void main(String[] args ){
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       int[] patients = new int[n];
       for(int i = 0 ; i  < n; i++){
        patients[i] = sc.nextInt();
       }
       int[] id = new int[n];
       for(int i = 0 ; i < n ; i++){
        id[i] = sc.nextInt();
       }
       //sorting patient ids and id
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i +1 ; j < n ; j++){
                if(id[i] > id[j]){
                    int temp = id[i];
                    id[i] = id[j];  
                    id[j] = temp;
                    //sorting patients 
                    int temp2 = patients[i];
                    patients[i] = patients[j];
                    patients[j] = temp2;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(patients[i] + " ");
        }
    }
}
