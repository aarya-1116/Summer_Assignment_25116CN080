import java.util.Scanner;
public class xpowern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number first and then its power.");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int pow=1;
        for(int i=1;i<=n;i++){
            pow=pow*x;
        }
        System.out.println("Answer="+pow);
        sc.close();
    }
}
