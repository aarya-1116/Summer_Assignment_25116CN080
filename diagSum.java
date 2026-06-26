import java.util.Scanner;

public class diagSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows and columns for matrix:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    sum=sum+mat[i][j];
                }
            }
        }
       System.out.println("Sum of diagonal elements of matrix:"+sum);
       sc.close();
}
}    
