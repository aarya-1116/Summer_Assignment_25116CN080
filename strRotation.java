import java.util.Scanner;
public class strRotation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String st1=sc.next();
        System.out.println("Enter second string:");
        String st2=sc.next();
        if(st1.length()==st2.length() && (st1+st1).contains(st2)){
            System.out.println("String is rotation.");
        }
        else{
            System.out.println("String is not a rotation.");
        }
        sc.close();
    }
}