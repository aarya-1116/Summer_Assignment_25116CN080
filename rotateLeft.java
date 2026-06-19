import java.util.Scanner;
public class rotateLeft{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[] =new int [n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int temp1=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp1;
        }
        System.out.println("Array rotated left:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}