import java.util.Scanner;
public class rotateRight{
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
            int tem=arr[n-1-i];
            arr[n-1-i]=arr[n-2-i];
            arr[n-2-i]=tem;
        }
        System.out.println("Array rotated right:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}