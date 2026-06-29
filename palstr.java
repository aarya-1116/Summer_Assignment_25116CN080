import java.util.Scanner;
public class palstr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String st=sc.next();
        String str=st.toLowerCase();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            rev=rev+ch;
        }
        if(rev.equals(str)){
            System.out.println("The given string is palindrome.");
        }
        else{
            System.out.println("The given string is not palindrome.");
        }
        sc.close();
    }
}