import java.util.Scanner;
public class fib{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of fibonacci series :");
        int n=sc.nextInt();
        int a=0,b=1,c;
        if(n>=1){
          System.out.println(a);
          System.out.println(b);
        }
        for(int i=1;i<=n-2;i++){
           c=a+b;
           System.out.println(c);
           a=b;
           b=c; 
        }
        sc.close();
    }
}