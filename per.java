import java.util.Scanner;
public class per {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to check if it is perfect:");
      int n=sc.nextInt();
      int per=0;
      for(int i=1;i<=n/2;i++){
        if(n%i==0){
            per=per+i;
        }
      }
      if(per==n){
        System.out.println("The number is perfect.");
      }
      else{
        System.out.println("The number is not perfect.");
      }
      sc.close();
    }
}
