import java.util.Scanner;
public class BankAccountSystem {
    static class Account{
        String name;
        String acctype;
        int number;
        double balance;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account[] acc=new Account[100];
        int count=0;
        System.out.println("----Bank Account System----");
        System.out.println("1.Add account\n2.Display all accounts\n3.Search account\n4.Deposit\n5.Withdraw\n6.Transfer\n7.Delete account\n8.Exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        while(choice!=8){
            switch(choice){
              case 1:acc[count]=new Account();
              sc.nextLine();
                System.out.println("Enter the name of customer:");
                acc[count].name=sc.nextLine();
                System.out.println("Enter the type of account:");
                acc[count].acctype=sc.nextLine();
                System.out.println("Enter the account number:");
                acc[count].number=sc.nextInt();
                System.out.println("Enter the amount of balance in account:");
                acc[count].balance=sc.nextDouble();
                count++;
                System.out.println("Bank account added successfully!");
                break;
                case 2:for(int i=0;i<count;i++){
                    System.out.println("Customer "+(i+1)+":");
                    System.out.println("Customer name:"+acc[i].name);
                    System.out.println("Type of account:"+acc[i].acctype);
                    System.out.println("Account number:"+acc[i].number);
                    System.out.println("Balance:"+acc[i].balance);
                }
                break;
                case 3:System.out.println("Enter the account number:");
                int searchno=sc.nextInt();int index=-1;
                for(int i=0;i<count;i++){
                    if(searchno==acc[i].number){
                        index=i;
                        break;
                    }
                }
                if(index==-1){
                   System.out.println("Account not found!");
                }
                else{
                    System.out.println("Customer name:"+acc[index].name);
                    System.out.println("Type of account:"+acc[index].acctype);
                    System.out.println("Account number:"+acc[index].number);
                    System.out.println("Balance:"+acc[index].balance);
                }
                break;
                case 4:System.out.println("Enter the account number:");
                int depno=sc.nextInt();int depindex=-1;
                for(int i=0;i<count;i++){
                    if(depno==acc[i].number){
                        depindex=i;
                        break;
                    }
                }
                if(depindex==-1){
                   System.out.println("Account not found!");
                }
                else{
                    System.out.println("Enter the amount to be deposited:");
                    double deposit=sc.nextDouble();
                    acc[depindex].balance+=deposit;
                    System.out.println("Amount deposited successfully!\nNew Balance="+acc[depindex].balance);
                }
                break;
                case 5:System.out.println("Enter the account number:");
                int withno=sc.nextInt();int withindex=-1;
                for(int i=0;i<count;i++){
                    if(withno==acc[i].number){
                        withindex=i;
                        break;
                    }
                }
                if(withindex==-1){
                   System.out.println("Account not found!");
                }
                else{
                    System.out.println("Enter the amount to be deposited:");
                    double withdraw=sc.nextDouble();
                    acc[withindex].balance-=withdraw;
                    System.out.println("Amount withdrawn successfully!\nNew Balance="+acc[withindex].balance);
                }
                break;
                case 6:
                    System.out.println("Enter sender account number:");
                    int no1 = sc.nextInt();
                    System.out.println("Enter receiver account number:");
                    int no2 = sc.nextInt();
                    int sender = -1;
                    int receiver =-1;
                    for(int i = 0; i < count; i++){
                        if(acc[i].number == no1){
                        sender = i;
                    }
                    if(acc[i].number == no2){
                     receiver = i;
                    }
                }
                if(sender == -1){
                    System.out.println("Sender account not found!");
                }
                else if(receiver == -1){
                    System.out.println("Receiver account not found!");
                }
                else{
                    System.out.println("Enter amount to transfer:");
                    double amount = sc.nextDouble();
                    if(amount <= 0){
                 System.out.println("Invalid amount!");
                 }
                else if(acc[sender].balance < amount){
                System.out.println("Insufficient balance!");
                }
                else{
            acc[sender].balance -= amount;
            acc[receiver].balance += amount;

            System.out.println("Transfer successful!");
            System.out.println("Sender Balance: " + acc[sender].balance);
            System.out.println("Receiver Balance: " + acc[receiver].balance);
              }
            }
            break;
            case 7:System.out.println("Enter the account number:");
                int delno=sc.nextInt();int delindex=-1;
                for(int i=0;i<count;i++){
                    if(delno==acc[i].number){
                        delindex=i;
                        break;
                    }
                }
                if(delindex==-1){
                   System.out.println("Account not found!");
                }
                else{
                    for(int i=delindex;i<count;i++){
                        acc[i]=acc[i+1];
                    }
                    count--;
                    acc[count]=null;
                    System.out.println("Account deleted successfully!");
                }
                break;
                default:System.out.println("Invalid input.");
                break;
            }
            System.out.println("1.Add account\n2.Display all accounts\n3.Search account\n4.Deposit\n5.Withdraw\n6.Transfer\n7.Delete account\n8.Exit");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        }
        sc.close();
    }
}
