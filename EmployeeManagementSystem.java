import java.util.Scanner;
public class EmployeeManagementSystem {
    static class Employee{
        int id;
        String name;
        String department;
        double salary;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Employee[] emp=new Employee[100];
     int count=0;
     System.out.println("----Employee Management System----");
     System.out.println("1.Add Employee\n2.Display Employee\n3.Search Employee\n4.Update employee\n5.Delete Employee\n6.Exit\nEnter your choice:");
     int choice=sc.nextInt();
     while(choice!=6){
        switch(choice){
            case 1: emp[count]=new Employee();
                System.out.println("Enter id:");
            emp[count].id=sc.nextInt();
            System.out.println("Enter name:");
            sc.nextLine();
            emp[count].name=sc.nextLine();
            System.out.println("Enter department:");
            emp[count].department=sc.nextLine();
            System.out.println("Enter salary:");
            emp[count].salary=sc.nextDouble();
            System.out.println("Employee added successfully.");
            count++;
                break;
             case 2:for(int i=0;i<count;i++){
                System.out.println("Employee id:"+emp[i].id);
                System.out.println("Employee name:"+emp[i].name);
                System.out.println("Employee department:"+emp[i].department);
                System.out.println("Employee salary:"+emp[i].salary);
             }
                break;
             case 3:System.out.println("Enter the id of the employee:");
             int searchid=sc.nextInt();
                int index=-1;
             for(int i=0;i<count;i++){
                if(searchid==emp[i].id){ 
                index=i;
                break;
             }}
             if(index==-1)
                System.out.println("Employee not found.");
            else{
                 System.out.println("Employee id:"+emp[index].id);
                System.out.println("Employee name:"+emp[index].name);
                System.out.println("Employee department:"+emp[index].department);
                System.out.println("Employee salary:"+emp[index].salary);
            }
                break;
             case 4:System.out.println("Enter the id of the employee:");
             int updateid=sc.nextInt();int ind=-1;
             for(int i=0;i<count;i++){
                if(updateid==emp[i].id){ 
                ind=i;
                break;
             }}
             if(ind==-1)
                System.out.println("Employee not found.");
        else{ 
                System.out.println("To update the information of employee enter choice from following:");
             System.out.println("1.Id\n2.Name\n3.Department\n4.Salary\n5.Exit");
             int upchoice=sc.nextInt();
             while(upchoice!=5){
                switch(upchoice){
                    case 1:System.out.println("Enter new id");
                    emp[ind].id=sc.nextInt();
                    break;
                    case 2:System.out.println("Enter new name");
                    sc.nextLine();
                    emp[ind].name=sc.nextLine();
                    break;
                    case 3:System.out.println("Enter new department");
                    emp[ind].department=sc.nextLine();
                    break;
                    case 4:System.out.println("Enter new salary");
                    emp[ind].salary=sc.nextDouble();
                    break;
                    default:System.out.println("Invalid input.");
                    break;
                }
             System.out.println("To update the information of employee enter choice from following:");
             System.out.println("1.Id\n2.Name\n3.Department\n4.Salary\n5.Exit");
             upchoice=sc.nextInt();
             }
            System.out.println("Emloyee updated successfully.");
            }
                break;
             case 5:System.out.println("Enter the id of the employee:");
             int deleteid=sc.nextInt();int in=-1;
             for(int i=0;i<count;i++){
                if(deleteid==emp[i].id){ 
                in=i;
                break;
             }}
             if(in==-1)
                System.out.println("Employee not found.");
        else{
            for(int i=in;i<count-1;i++){
                emp[i]=emp[i+1];
            }
            count--;
            emp[count]=null;
            System.out.println("Employee deleted successfully.");
        }
                break;
            default:System.out.println("Invalid input.");
                 break;
        }
         System.out.println("1.Add Employee\n2.Display Employee\n3.Search Employee\n4.Update employee\n5.Delete Employee\n6.Exit\nEnter your choice:");
         choice=sc.nextInt(); 
     }  
     System.out.println("Thank you for using Employee Management System.");
     sc.close(); 
    }
}
