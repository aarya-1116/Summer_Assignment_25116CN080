import java.util.Scanner;
public class evaod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt(),even=0,odd=0;
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of even elements="+even);
        System.out.println("Number of odd elements="+odd);
        sc.close();
    }
}
