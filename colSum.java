import java.util.Scanner;

public class colSum {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for matrix:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int mat[][]=new int[r1][c1];
        System.out.println("Enter elements of matrix:");
          for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<c1;j++){
            int sum=0;
            for(int i=0;i<r1;i++){
                sum=sum+mat[i][j];
            }
            System.out.println("Sum of column "+(j+1)+" = "+sum);
        }
        sc.close();
      }    
}
