import java.util.Scanner;
public class LibraryManagementSystem{
    static class Book{
        String name;
        String author;
        int id;
        int copies;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book[] books=new Book[100];
        int count=0;
        System.out.println("----Library Management System----");
        System.out.println("1.Add Book\n2.Display Books\n3.Issue Book\n4.Return Book\n5.Delete Book\n6.Exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        while(choice!=6){
            switch(choice){
                case 1:books[count]=new Book();
                    System.out.println("Enter the name of the book:");
                    sc.nextLine();
                books[count].name=sc.nextLine();
                System.out.println("Enter the name of the author:");
                books[count].author=sc.nextLine();
                System.out.println("Enter the unique id of the book:");
                books[count].id=sc.nextInt();
                System.out.println("Enter the number of copies of this book:");
                books[count].copies=sc.nextInt();
                count++;
                break;
                case 2:for(int i=0;i<count;i++){
                    System.out.println("Name:"+books[i].name);
                    System.out.println("Nameof the author:"+books[i].author);
                    System.out.println("Unique id:"+books[i].id);
                    System.out.println("Number of copies:"+books[i].copies);
                }
                break;
                case 3:System.out.println("Enter the unique id of the book:");
                int issueid=sc.nextInt();int index=-1;
                for(int i=0;i<count;i++){
                    if(issueid==books[i].id){
                        index=i;
                        break;
                    }
                }
                if(index==-1||books[index].copies==0){
                   System.out.println("No book found."); 
                }
                else{
                    books[index].copies--;
                    System.out.println("Book issued successfully!");
                }
                break;
                case 4:System.out.println("Enter the unique id of the book:");
                int returnid=sc.nextInt();int index1=-1;
                for(int i=0;i<count;i++){
                    if(returnid==books[i].id){
                        index1=i;
                        break;
                    }
                }
                books[index1].copies++;
                System.out.println("Book returned successfully!");
                break;
                case 5:System.out.println("Enter the unique id of the book:");
                int deleteid=sc.nextInt();int index2=-1;
                for(int i=0;i<count;i++){
                    if(deleteid==books[i].id){
                        index2=i;
                        break;
                    }
                }
                if(index2==-1){
                   System.out.println("No book found."); 
                }
                else{
                    for(int i=index2;i<count;i++){
                        books[i]=books[i+1];
                    }
                    count--;
                    books[count]=null;
                    System.out.println("Book deleted successfully!");
                }
                break;
                default:System.out.println("Invalid input.");
                break;
            }
             System.out.println("1.Add Book\n2.Display Books\n3.Issue Book\n4.Return Book\n5.Delete Book\n6.Exit");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        }
        System.out.println("Thanks for using Library Management System.");
        sc.close();
    }
}