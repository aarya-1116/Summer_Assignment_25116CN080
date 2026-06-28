import java.util.Scanner;
public class secondLar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],secmax=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                if(arr[i]!=max)
                secmax=max;
                max=arr[i];
            }
        }
        
        System.out.println("Second largest element="+secmax);
        sc.close();
    }
}
