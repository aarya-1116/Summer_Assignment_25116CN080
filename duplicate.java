import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            boolean alreadyPrinted=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                alreadyPrinted=true;
                break;
        }}
        if(alreadyPrinted)
            continue;
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                System.out.println("Duplicate="+arr[i]);
                break;
            }
        }
    }
    sc.close();
}}

