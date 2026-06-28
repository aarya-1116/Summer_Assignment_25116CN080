import java.util.Scanner;

public class ContactManagementSystem {

    static class Contact {
        String name;
        long phoneNumber;
        String email;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     Contact[] contacts = new Contact[100];
     int count = 0;
     while (true) {
            System.out.println("\n----- Contact Management System -----");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:contacts[count]=new Contact();
                sc.nextLine();
                    System.out.println("Enter name of contact");
                    contacts[count].name=sc.nextLine();
                    System.out.println("Enter email:");
                    contacts[count].email=sc.nextLine();
                    System.out.println("Enter phonenumber");
                    contacts[count].phoneNumber=sc.nextLong();
                    count++;
                    break;

                case 2:
                    for(int i=0;i<count;i++){
                        System.out.println("Name:"+contacts[i].name);
                        System.out.println("Number:"+contacts[i].phoneNumber);
                        System.out.println("Email:"+contacts[i].email);
                    }
                    break;

                case 3:System.out.println("Enter phone number to search:");
                long searchPhone = sc.nextLong();
                int index = -1;
                for(int i = 0; i < count; i++){
                    if(contacts[i].phoneNumber == searchPhone){
                    index = i;
                    break;
                }
            }
            if(index == -1){
              System.out.println("Contact not found!");
            }
            else{
                System.out.println("Name: " + contacts[index].name);
                System.out.println("Phone Number: " + contacts[index].phoneNumber);
                System.out.println("Email: " + contacts[index].email);
            }
            break;

                case 4:
                    System.out.println("Enter the phone number of the contact to update:");
                    long updatePhone = sc.nextLong();
                    int updateIndex = -1;
                    for(int i = 0; i < count; i++){
                        if(contacts[i].phoneNumber == updatePhone){
                            updateIndex = i;
                            break;
                            }
                        }
                        if(updateIndex == -1){
                           System.out.println("Contact not found!");
                         }
                        else{
                    sc.nextLine(); 
                     System.out.println("Enter new name:");
                    contacts[updateIndex].name = sc.nextLine();
                    System.out.println("Enter new phone number:");
                    contacts[updateIndex].phoneNumber = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Enter new email:");
                    contacts[updateIndex].email = sc.nextLine();
                     System.out.println("Contact updated successfully!");
                    }
                    break;

                case 5:
                    System.out.println("Enter the phone number of the contact to delete:");
                    long deletePhone = sc.nextLong();
                    int deleteIndex = -1;
                   for(int i = 0; i < count; i++){
                     if(contacts[i].phoneNumber == deletePhone){
                         deleteIndex = i;
                         break;
                        }
                     }

                    if(deleteIndex == -1){
                         System.out.println("Contact not found!");
                    }
                    else{
                        for(int i = deleteIndex; i < count - 1; i++){
                          contacts[i] = contacts[i + 1];
                        }
                        contacts[count - 1] = null; 
                        count--;
                        System.out.println("Contact deleted successfully!");
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
