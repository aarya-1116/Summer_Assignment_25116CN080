import java.util.Scanner;
public class strcomChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();boolean alreadyPresent;
        for(int i=0;i<str.length();i++){
            alreadyPresent=false;
            for(int k=0;k<i;k++){
                if(str.charAt(i)==str.charAt(k)){
                    alreadyPresent=true;
                }
            }
            if(alreadyPresent)
                continue;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
        sc.close();
    }
}