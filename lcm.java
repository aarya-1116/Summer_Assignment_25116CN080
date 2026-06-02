import java.util.Scanner;
public class lcm{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers to get their lcm:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int lcm=a>b?a:b;
    while(true){
        if(lcm%a == 0 && lcm%b ==0 ){
            System.out.println("The lcm of these two numbers is="+lcm);
            break;
        }
        lcm++;
    } 
    sc.close();
    }
}