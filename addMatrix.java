import java.util.Scanner;
public class addMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows and columns for two matrices:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat1=new int[row][col];
        int[][] mat2=new int[row][col];
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat2[i][j]=sc.nextInt();
            }
            }int add[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                add[i][j]=mat1[i][j]+mat2[i][j];
            }
        }  
        System.out.println("Addition of two matrices:");  
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
