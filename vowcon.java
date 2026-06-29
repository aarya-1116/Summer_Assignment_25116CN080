import java.util.Scanner;
public class vowcon{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();int vowels=0,con=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowels++;
            }
            else{
                con++;
            }
        }
        System.out.println("Vowels="+vowels+" consonants="+con);
        sc.close();
    }
}