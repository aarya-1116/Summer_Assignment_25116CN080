import java.util.Scanner;
public class largestPrime {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to get its largest prime factor:");
      int n=sc.nextInt();int lpf=0,c;
      for(int i=2;i<=n;i++){
        c=0;
        if(n%i==0){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    c++;
                }
            }
        if(c==0){
            lpf=i;
        }}
      }
      System.out.println("Largest prime factor ="+ lpf);
      sc.close();
    }
}
