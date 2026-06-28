import java.util.Scanner;
public class recSum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to get sum of its digits :");
    int n=sc.nextInt(); 
    System.out.println(sumofdigits(n));
    sc.close();    
    }
    static int sumofdigits(int n){
        if(n==0)
            return 0;
        return (n%10)+sumofdigits(n/10);
    }
}
