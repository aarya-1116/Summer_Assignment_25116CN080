import java.util.Scanner;
public class recFib {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the range of fibonacci series.");
     int n=sc.nextInt();
     for(int i=0;i<n;i++){
        System.out.println(Fib(i)+" ");
     }   
     sc.close();
    }
    static int Fib(int n){
        if(n==0)
            return 0;
        if (n==1)
            return 1;
        return Fib(n-1)+Fib(n-2);
    }
}
