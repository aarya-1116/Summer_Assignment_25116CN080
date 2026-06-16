import java.util.Scanner;
public class funcPer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if it is perfect:");
        int n=sc.nextInt();
        if(perfect(n))
            System.out.println("It is a perfect number.");
        else
            System.out.println("It is not a pefect number.");
        sc.close();
    }
    static boolean perfect(int n){
        int per=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                per=per+i;
            }
        }
        if(per==n)
            return true;
        else
            return false;
    }
}