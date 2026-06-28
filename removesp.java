import java.util.Scanner;
public class removesp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String newstr="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' ')
                continue;
            newstr=newstr+ch;
        }
        System.out.println("String without spaces:"+newstr);
        sc.close();
    }
}