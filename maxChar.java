import java.util.Scanner;
public class maxChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();int freq=0,max=0;char ch=str.charAt(0);
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    freq++;
                }
            }
            if(freq>max){
                max=freq;
                ch=str.charAt(i);
            }
        }
        System.out.println("Maximum occuring character is "+ch);
        sc.close();
    }
}