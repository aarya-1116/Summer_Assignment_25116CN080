import java.util.Scanner;
public class strLength{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        char[] arr=str.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++){
            c++;
        }
        System.out.println("Lenth of given string:"+c);
        sc.close();
    }
}