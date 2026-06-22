import java.util.Scanner;
public class countWords{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
               c++;
            }
        }
        System.out.println("The number of words in this string are "+(c+1));
        sc.close();
    }
}