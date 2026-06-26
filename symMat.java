import java.util.Scanner;

public class symMat {
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
        }boolean symmetric=true;         
         for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                if(mat[i][j]!=mat[j][i]){
                   symmetric=false;
                   break;
                }
            }}
            if(!symmetric){
                System.out.println("The given matrix is not symmetric.");
            }
            else{
                System.out.println("The given matrix is symmetric.");
            }
        sc.close();
    }
}
