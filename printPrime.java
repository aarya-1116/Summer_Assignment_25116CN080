import java.util.Scanner;
public class printPrime {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of prime numbers:");
    int n=sc.nextInt();
    for(int i=2;i<=n;i++){
        int c=0;
        for(int j=2;j<i;j++){
            if(i%j==0){
                c++;
            }
        }
        if(c==0){
            System.out.println(i);
        }
    } 
    sc.close();   
    }
}
