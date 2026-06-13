import java.util.Scanner;
public class prime {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to check if it is prime:");
    int n=sc.nextInt();
    int c=0;
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            c++;
        }
    }
    if(c==0 || n==2){
        System.out.println("The entered number is prime.");
    }
    else{
        System.out.println("The entered number is not prime.");
    }
    sc.close();
}
}
