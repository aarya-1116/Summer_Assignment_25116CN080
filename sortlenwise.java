import java.util.Scanner;
public class sortlenwise{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int n=sc.nextInt();
        System.out.println("Enter words:");
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
             if(words[j].length()>words[j+1].length()){
                String temp=words[j];
                words[j]=words[j+1];
                words[j+1]=temp;
             }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(words[i]);
        }
        sc.close();
    }
}