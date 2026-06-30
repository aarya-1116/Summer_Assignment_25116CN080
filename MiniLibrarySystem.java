import java.util.Scanner;

public class MiniLibrarySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] bookId = new int[100];
        String[] title = new String[100];
        String[] author = new String[100];
        String[] status = new String[100];

        int count = 0;

        while (true) {

            System.out.println("\n----- MINI LIBRARY SYSTEM -----");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 7)
                break;

            switch (choice) {

                case 1:
                    System.out.println("Enter book id:");
                    bookId[count]=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter title:");
                    title[count]=sc.nextLine();
                    System.out.println("Enter author:");
                    author[count]=sc.nextLine();
                    status[count]="Available";
                    count++;
                    break;

                case 2:System.out.printf("%-8s %-25s %-20s %-12s%n",
                "Id","Title","Author","Status");
                for(int i=0;i<count;i++){
                     System.out.printf("%-8d %-25s %-20s %-12s%n",
                      bookId[i], title[i], author[i], status[i]);
                }
                    break;

                case 3:System.out.println("Enter the id of the book:");
                int id=sc.nextInt();boolean found=false;
                    for(int i=0;i<count;i++){
                        if(id==bookId[i]){
                            found=true;
                            System.out.printf("%-8s %-25s %-20s %-12s%n",
                "Id","Title","Author","Status");
                            System.out.printf("%-8d %-25s %-20s %-12s%n",
                      bookId[i], title[i], author[i], status[i]);
                        }
                    }
                    if(!found)
                        System.out.println("No student found.");
                    break;

                case 4:System.out.println("Enter the id of the book:");
                int issueid=sc.nextInt();boolean found1=false;
                for(int i=0;i<count;i++){
                    if(issueid==bookId[i]){
                        found1=true;
                        if(status[i].equals("Available")){
                           status[i]="Issued";
                           System.out.println("Book issued successfully!");
                        }
                        else{
                            System.out.println("Already issued.");
                        }
                    }
                }
                    if(!found1)
                        System.out.println("Book not found.");
                    break;

                case 5:System.out.println("Enter the id of the book:");
                int returnid=sc.nextInt();boolean found2=false;
                for(int i=0;i<count;i++){
                    if(returnid==bookId[i]){
                        found2=true;
                        if(status[i].equals("Issued")){
                           status[i]="Available";
                           System.out.println("Book returned successfully!");
                        }
                        else{
                            System.out.println("Already available.");
                        }
                    }
                }
                 if(!found2)
                        System.out.println("Book not found.");
                    break;

                case 6:System.out.println("Enter the id of the book:");
                int deleteid=sc.nextInt();boolean found3=false;
                for(int i=0;i<count;i++){
                    if(deleteid==bookId[i]){
                        found3=true;
                        for(int j=i;j<count-1;j++){
                            bookId[j]=bookId[j+1];
                            title[j]=title[j+1];
                            author[j]=author[j+1];
                            status[j]=status[j+1];
                            System.out.println("Book deleted successfully!");
                        }
                        count--;
                        break;
                    }
                }
                if(!found3)
                        System.out.println("Book not found.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        System.out.println("Thank you!");
        sc.close();
    }
}
