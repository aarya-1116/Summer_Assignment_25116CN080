import java.util.Scanner;
public class recRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get its reverse :");
        int n=sc.nextInt();
        System.out.println("Reverse="+reverse(n,0));
        sc.close();
    }
    static int reverse(int n,int rev){
        if(n==0)
            return rev;
       
        return reverse(n/10,rev*10+n%10);
    }
}
