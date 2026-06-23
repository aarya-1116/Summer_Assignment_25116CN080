import java.util.Scanner;

public class intersection {
    public static void main(String[] args) {
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
        System.out.println("Intersection:");
         for(int i=0;i<a;i++){
            boolean alreadyPrinted=false;
            for(int k=0;k<i;k++){ 
            if(ar1[k]==ar1[i]){
                alreadyPrinted=true;
                break;
            }}
            if (alreadyPrinted)
                continue;
            for(int j=0;j<b;j++){
                if(ar1[i]==ar2[j]){
                    System.out.print(ar2[i] + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}
