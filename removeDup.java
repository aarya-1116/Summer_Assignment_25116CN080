import java.util.Scanner;
public class removeDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int size=n;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                   for(int k = j; k < size - 1; k++) {
                       arr[k] = arr[k + 1];
                   }
                size--;
                j--;
                }
            }
        }
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
}
}
