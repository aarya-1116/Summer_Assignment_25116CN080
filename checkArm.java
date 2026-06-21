import java.util.Scanner;
public class checkArm {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number to check if it is armstrong :");
    int n=sc.nextInt();double d,c=0;int x=n,y=n;double arm=0;
    while(n!=0){
        c++;
        n=n/10;
    }
    while(x!=0){
        d=x%10;
        arm=arm + Math.pow(d,c);
        x=x/10;
    }
    if(arm==y){
        System.out.println("The entered number is armstrong.");
    }
    else{
        System.out.println("The entered number is not armstrong.");
    } 
    sc.close();
    }
}
