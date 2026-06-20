import java.util.Scanner;

public class binarySearch {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of sorted array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int x=sc.nextInt();
        int high=n-1;
        int low=0;
        int mid;
       while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                System.out.println("Element found at index = "+mid);
                break;
            }
        }
        sc.close();
     }    
}
