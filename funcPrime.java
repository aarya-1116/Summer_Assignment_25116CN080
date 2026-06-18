import java.util.Scanner;
public class funcPrime{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number to check if it is prime:");
       int n=sc.nextInt();
       if(prime(n)==true)
        System.out.println("It is prime.");
    else
        System.out.println("It is not prime.");
       sc.close();
    }
    static boolean prime(int n){
        int c=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==0)
            return true;
        else
            return false;
    }
}
