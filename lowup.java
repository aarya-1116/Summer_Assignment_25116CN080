import java.util.Scanner;
public class lowup{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        String upstr,lowstr;
        upstr=str.toUpperCase();
        lowstr=str.toLowerCase();
        System.out.println("Uper case:"+upstr);
        System.out.println("Lower case: "+lowstr);
        sc.close();
    }
}