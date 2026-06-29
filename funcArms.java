import java.util.Scanner;
public class funcArms{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if its armstrong:");
        int n=sc.nextInt();
        if(armstrong(n))
            System.out.println("It is armstrong.");
        else
            System.out.println("It is not armstrong.");
        sc.close();
    }
    static boolean armstrong(int n){
        int x=n;int c=0;int arm=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        n=x;
        while(n!=0){
            int d=n%10;
            arm=arm+(int)Math.pow(d,c);
            n=n/10;
        }
        if(x==arm){
            return true;
        }
        else{
            return false;
        }
    }
}