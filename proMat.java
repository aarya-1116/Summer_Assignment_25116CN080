import java.util.Scanner;
public class proMat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for first matrix:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int mat1[][]=new int[r1][c1];
        System.out.println("Enter the number of rows and columns for second matrix:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int mat2[][]=new int[r2][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }int pro[][]=new int[r1][c2];
         for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++)
                pro[i][j]=pro[i][j]+mat1[i][k]*mat2[k][j];
            }
        }
         for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(pro[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}