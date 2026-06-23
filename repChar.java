import java.util.Scanner;
public class repChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            int freq=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    freq++;
                }
            }
            if(freq!=1){
                System.out.println("The first repeating character in given string is "+str.charAt(i));
                break;
            }
        }
        sc.close();
    }
}