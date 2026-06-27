import java.util.Scanner;
public class mergeArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of two arrays");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ar1[]=new int[a];
        int ar2[]=new int[b];
        System.out.println("Enter elements of first array:");
        for(int i=0;i<a;i++){
            ar1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for(int i=0;i<b;i++){
            ar2[i]=sc.nextInt();
        }
        int ar3[]=new int[a+b];
        for(int i=0;i<a;i++){
            ar3[i]=ar1[i];
        }int j=0;
        for(int i=a;i<(a+b);i++){
            ar3[i]=ar2[j];
            j++;
        }
        for(int i=0;i<(a+b);i++){
            System.out.println(ar3[i]);
        }
        sc.close();
    }
}