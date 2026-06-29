import java.util.Scanner;
public class menudrivenCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculator:");
        while(true){
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        if(choice==6)
            break;
        System.out.println("Enter first number:");
        int n1=sc.nextInt();
        System.out.println("Enter the second number:");
        int n2=sc.nextInt();
        switch(choice){
            case 1:System.out.println("Sum:"+(n1+n2));
            break;
            case 2:System.out.println("Difference:"+(n1-n2));
            break;
            case 3:System.out.println("Product:"+(n1*n2));
            break;
            case 4:if(n2==0)
                System.out.println("Division by 0not possible");
            else
                System.out.println("Division:"+((double)n1/n2));
            break;
            case 5:if(n2==0)
                System.out.println("Modulus by 0 not possible");
            else
                System.out.println("Modulus:"+(n1%n2));
            break;
            default:System.out.println("Invalid input.");
            break;
        }
        }
        System.out.println("Thank you for using the calculator.");
        sc.close();
    }
    }

