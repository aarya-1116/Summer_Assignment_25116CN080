import java.util.Scanner;
public class strong {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to check if it is strong:");
      int n=sc.nextInt();int d,fact,sum=0;int x=n;
      while(n!=0){
        fact=1;
        d=n%10;
        for(int i=1;i<=d;i++){
            fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
      }
      if(x==sum){
        System.out.println("The number is strong.");
      }
      else{
        System.out.println("The number is not a strong number.");
      }
      sc.close();
    }
}
