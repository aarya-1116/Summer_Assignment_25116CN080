import java.util.Scanner;
public class reverseStr{
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        String newstr="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            newstr=newstr+ch;
        }
        System.out.println("Reversed string: "+newstr);
        sc.close();
       }
}