import java.util.Scanner;
public class funcPal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if its palindrome:");
        int n=sc.nextInt();
        if(palindrome(n))
            System.out.println("It is palindrome.");
        else
            System.out.println("It is not palindrome.");
        sc.close();
    }
    static boolean palindrome(int n){
        int x=n;int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==x)
            return true;
        else
            return false;
    }
}