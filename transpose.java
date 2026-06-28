import java.util.Scanner;

public class transpose {
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
        }int[][] transpose=new int[col][row];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            transpose[i][j]=mat[j][i];
        }
    }System.out.println("Transpose:");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(transpose[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
}
}
