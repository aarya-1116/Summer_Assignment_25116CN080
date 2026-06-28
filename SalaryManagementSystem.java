import java.util.Scanner;
 class SalaryManagementSystem {
    static class Employee{
        int id;
        double basicSalary;
        double hra;
        double da;
        double deduction;
        double netSalary;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee[] emp=new Employee[100];int count=0;
        System.out.println("----Salary Management System----");
        System.out.println("1.Add Employee Salary\n2.Display Salaries\n3.Update Salary\n4.Delete Salary Record\n5.Exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        while(choice!=5){
            switch(choice){
                case 1:emp[count]=new Employee();
                    System.out.println("Enter employee id:");
                 emp[count].id=sc.nextInt();
                 System.out.println("Enter basic salary:");
                 emp[count].basicSalary=sc.nextDouble();
                 System.out.println("Enter house rent allowance:");
                 emp[count].hra=sc.nextDouble();
                 System.out.println("Enter dearness allowance:");
                 emp[count].da=sc.nextDouble();
                 System.out.println("Enter deduction:");
                 emp[count].deduction=sc.nextDouble();
                 emp[count].netSalary=emp[count].basicSalary+emp[count].hra+emp[count].da-emp[count].deduction;
                 count++;
                 break;
                 case 2:for(int i=0;i<count;i++){
                    System.out.println("Employee id:"+emp[i].id);
                    System.out.println("Employee basic salary:"+emp[i].basicSalary);
                    System.out.println("Employee house rent allowance:"+emp[i].hra);
                     System.out.println("Employee dearness allowance:"+emp[i].da);
                 System.out.println("Employee deduction:"+emp[i].deduction);
                  System.out.println("Employee net salary:"+emp[i].netSalary);
                 }
                break;
                case 3:System.out.println("Enter the id of the employee:");
                int updateid=sc.nextInt();int index=-1;
                for(int i=0;i<count;i++){
                    if(emp[i].id==updateid){
                        index=i;
                        break;
                    }
                }
                if(index==-1){
                    System.out.println("No employee with that id found.");
                }
                else{
                    System.out.println("To update select one of the following:");
                    System.out.println("1.Basic Salary\n2.House rent allowance\n3.Dearness allowance\n4.Deductions");
                    int upchoice=sc.nextInt();
                    switch(upchoice){
                        case 1:System.out.println("Enter new basic salary:");
                        emp[index].basicSalary=sc.nextDouble();
                        break;
                        case 2:System.out.println("Enter new house rent allowance:");
                        emp[index].hra=sc.nextDouble();
                        break;
                        case 3:System.out.println("Enter new dearness allowance:");
                        emp[index].da=sc.nextDouble();
                        break;
                        case 4:System.out.println("Enter new deduction:");
                        emp[index].deduction=sc.nextDouble();
                        break;
                        default:System.out.println("Invalid input.");
                        break;
                    }
                    emp[index].netSalary=emp[index].basicSalary+emp[index].hra+emp[index].da-emp[index].deduction;
                    System.out.println("Salary updated successfully!");
                    break;
                }
                case 4:System.out.println("Enter id of the employee:");
                int deleteid=sc.nextInt();int delindex=-1;
                for(int i=0;i<count;i++){
                    if(deleteid==emp[i].id){
                        delindex=i;
                        break;
                    }
                }
                if(delindex==-1){
                    System.out.println("No emloyee with this id found.");
                }
                else{
                    for(int i=delindex;i<count-1;i++){
                        emp[i]=emp[i+1];
                    }
                    count--;
                    emp[count]=null;
                    System.out.println("Employee deleted successfully!");
                }
                break;
            }
             System.out.println("1.Add Employee Salary\n2.Display Salaries\n3.Update Salary\n4.Delete Salary Record\n5.Exit");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        }
        System.out.println("Thank you for using Salary Management System.");
        sc.close();
    }
}
