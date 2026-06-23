import java.util.Scanner;
public class recFact{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get its factorial:");
        int n=sc.nextInt();
        int fac=fact(n);
        System.out.println(fac);
        sc.close();
    }
    static int fact(int n){
         if(n==0)
            return 1;
        return n*fact(n-1);   
        }
}