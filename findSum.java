import java.util.Scanner;
public class findSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number to get the maximum of two:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Maximum="+max(a,b));
        sc.close();
    }
    static int max(int a,int b){
        if(a>b)
        return a;
    else
       return b;
    }
}