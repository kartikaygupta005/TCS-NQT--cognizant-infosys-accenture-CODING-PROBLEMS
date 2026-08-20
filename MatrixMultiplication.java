import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row1 = sc.nextInt();
        int column1 = sc.nextInt();

        int row2 = sc.nextInt();
        int column2 = sc.nextInt();

        int[][] arr1 = new int[row1][column1];
        int[][] arr2 = new int[row2][column2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] answer = new int[row1][column2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {

                for (int k = 0; k < column1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }

            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
