import java.util.Scanner;

public class removeDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();boolean alreadyPresent;String newstr="";
        for(int i=0;i<str.length();i++){
            alreadyPresent=false;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    alreadyPresent=true;
                }
            }
            if(alreadyPresent)
                continue;
                   newstr=newstr+str.charAt(i);
        }
        System.out.println("String after removing duplicates:\n"+newstr);
        sc.close();
    }
}
