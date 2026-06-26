import java.util.Scanner;
public class ATMsimulation {
    static class Account{
        String name;
        long Accountnum;
        double balance;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    Account acc=new Account();
    acc.name="Aarya";
    acc.Accountnum=1234567;
    acc.balance=5000.0;
    System.out.println("Enter your choice:");
    System.out.println("1-Check balance\n2-Deposit\n3-Withdraw\n4-Exit");
    int choice=sc.nextInt();
    while(choice!=4){ 
    switch(choice){
        case 1:System.out.println("Account Holder Name:"+acc.name);
        System.out.println("Account Number:"+acc.Accountnum);
        System.out.println("Account Balance:"+acc.balance);
        break;
        case 2:System.out.println("Enter the amount to be deposited.\nThe amount should be a multiple of 100:");
        double amount=sc.nextDouble();
        while(amount%100!=0){
            System.out.println("Please enter a multiple of 100.");
            amount=sc.nextDouble();
        }
      acc.balance=acc.balance+amount;
        System.out.println("Account Balance:"+acc.balance);
        break;
        case 3:System.out.println("Enter the amount to be withdrawn.\nThe amount should be a multiple of 100:");
        double amount1=sc.nextDouble();
        while(amount1%100!=0){
            System.out.println("Please enter a multiple of 100.");
            amount1=sc.nextDouble();
        }
        if(amount1<=acc.balance){
            acc.balance=acc.balance-amount1;
            System.out.println("Account Balance:"+acc.balance);
        }
        else{
            System.out.println("Insufficient balance.");
        }
        break;
        default:System.out.println("Invalid choice!");
    }
    System.out.println("Enter your choice:");
    System.out.println("1-Check balance\n2-Deposit\n3-Withdraw\n4-Exit");
    choice=sc.nextInt();
}
System.out.println("Thank you for using the ATM!");
sc.close();
}
}
