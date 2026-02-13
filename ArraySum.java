import java.util.*;
public class ArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of rows");
        int row = sc.nextInt();
        System.out.println("enter no.of columns");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        System.out.print("Array Elements");
        for(int i = 0 ; i<row;i++){
            for(int j =0;j<col;j++){
                arr1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.print("Array Elements");
        for(int i = 0 ; i<row;i++){
            for(int j =0;j<col;j++){
                arr2[i][j] = sc.nextInt();
            }
             System.out.println();

        }
        for(int i = 0 ; i<row;i++){
            for(int j =0;j<col;j++){
                arr[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}