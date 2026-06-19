import java.util.Scanner;

public class selectionSort {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int k=0;k<n;k++){
            int minimum=k; 
        for(int i=k+1;i<n;i++){
            if(arr[i]<arr[minimum]){
                minimum=i;
            }
        }
        int temp=arr[k];
        arr[k]=arr[minimum];
        arr[minimum]=temp;
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    sc.close();
}
}
