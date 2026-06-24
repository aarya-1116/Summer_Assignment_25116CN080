import java.util.Scanner;
public class strCompress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();int freq;boolean alreadyPresent;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            alreadyPresent=false;
            freq=0;
            for(int k=0;k<i;k++){
                if(ch==str.charAt(k))
                    alreadyPresent=true;
            }
            if(alreadyPresent)
                continue;
            for(int j=0;j<str.length();j++){
                if(ch==str.charAt(j)){
                    freq++;
                }
            }
            System.out.print(ch);
            System.out.print(freq);
        }
        sc.close();
    }
}
