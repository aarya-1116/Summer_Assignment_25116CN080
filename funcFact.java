import java.util.Scanner;
public class funcFact{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get its factorial:");
        int n=sc.nextInt();
        System.out.println("Factorial="+fact(n));
        sc.close();
    }
    static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}