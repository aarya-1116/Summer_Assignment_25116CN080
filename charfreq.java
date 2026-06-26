import java.util.Scanner;
public class charfreq{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        int c;boolean alreadyPresent;
        for(int i=0;i<str.length();i++){
            c=1;alreadyPresent=false;
            char ch=str.charAt(i);
            for(int k=0;k<i;k++){
                if(ch==str.charAt(k)){ 
                    alreadyPresent=true;
                break;
            }
            }
            if(alreadyPresent)
                continue;
            for(int j=i+1;j<str.length();j++){ 
            if(ch==str.charAt(j)){
               c++;
            }
            }
            System.out.println("The frequency of "+ch+" = "+c);
        }
        sc.close();
    }
}