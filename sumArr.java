import java.util.Scanner;
public class sumArr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int sum=0,avg;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println("Sum="+sum);
        System.out.println("Average="+avg);
        sc.close();
    }
}
