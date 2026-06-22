import java.util.Scanner;

public class union {
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
        }int ar3[]=new int[a+b];
        for(int i=0;i<a;i++){
            ar3[i]=ar1[i];
        }int j=0;
        for(int i=a;i<(a+b);i++){
            ar3[i]=ar2[j];
            j++;
        }
        int size=a+b;
        for(int i=0;i<size;i++){
            for(int k=i+1;k<size;k++){
                if(ar3[i]==ar3[j]){
                   for(int l = k; l < size - 1; l++) {
                       ar3[l] = ar3[l + 1];
                   }
                size--;
                k--;
                }
            }
        }
        System.out.println("Union of two arrays:");
        for(int i=0;i<size;i++){
            System.out.print(ar3[i]+" ");
        }
    sc.close();
}
}
