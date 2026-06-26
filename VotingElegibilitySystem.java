import java.util.Scanner;
public class VotingElegibilitySystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.print("Are you an Indian citizen:(true/false)");
        boolean isCitizen=sc.nextBoolean();
        sc.close();
        if(age>=18 && (isCitizen)){
            System.out.println("You are elegible to vote.");
        }
        else{
            System.out.println("You are not elegible to vote.");
        }
    }
}