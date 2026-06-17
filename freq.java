import java.util.Scanner;
public class freq{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to get its frequecy in array:");
        int x=sc.nextInt(),c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                c++;
            }
        }
        if(c>0){
            System.out.println("The frequency of the entered number = "+c);
        }
        else{
            System.out.println("The frequency of the entered number = 0");
        }
        sc.close();
    }
}