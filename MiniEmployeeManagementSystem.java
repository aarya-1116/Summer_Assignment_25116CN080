import java.util.Scanner;
public class MiniEmployeeManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] empId = new int[100];
        String[] name = new String[100];
        String[] department = new String[100];
        double[] salary = new double[100];
        int count = 0;
        while (true) {

            System.out.println("\n----- EMPLOYEE MANAGEMENT SYSTEM -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 6)
                break;

            switch (choice) {

                case 1:
                  if (count == empId.length) {
                    System.out.println("Employee list is full.");
                    break;
                }
                System.out.print("Enter Employee ID: ");
                empId[count] = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                name[count] = sc.nextLine();
                System.out.print("Enter Department: ");
                department[count] = sc.nextLine();
                System.out.print("Enter Salary: ");
                salary[count] = sc.nextDouble();
                count++;
                System.out.println("Employee added successfully!");
                break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employees found."); 
                        break;
                    }
                    System.out.printf("%-10s %-20s %-20s %-10s%n",
                      "ID", "Name", "Department", "Salary");
                      for (int i = 0; i < count; i++) {
                        System.out.printf("%-10d %-20s %-20s %-10.2f%n",
                          empId[i], name[i], department[i], salary[i]);
                        }
                        break;

                case 3: if (count == 0){  
                        System.out.println("No employees found."); 
                        break;
                }
                    System.out.println("Enter id:");
                int searchid=sc.nextInt();boolean found=false;
                for(int i=0;i<count;i++){
                    if(searchid == empId[i]){
                        found=true;
                        System.out.printf("%-10s %-20s %-20s %-10s%n","ID","Name","Department","Salary");
                        System.out.printf("%-10d %-20s %-20s %-10.2f%n",empId[i], name[i], department[i], salary[i]);
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Employee not found.");
                }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No employees found."); 
                        break;
                    }
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    boolean found1 = false;
                    for (int i = 0; i < count; i++) {
                        if (updateId == empId[i]) {
                            found1 = true;
                            sc.nextLine();
                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();
                            System.out.print("Enter New Department: ");
                            department[i] = sc.nextLine();
                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();
                            System.out.println("Employee updated successfully!");
                            break;
                        }
                    }
                    if (!found1) {
                        System.out.println("Employee not found.");
                    }
                    break;

                      case 5:
                        if (count == 0) {
                            System.out.println("No employees found.");
                            break;
                        }
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = sc.nextInt();
                        boolean found2 = false;
                        for (int i = 0; i < count; i++) {
                            if (deleteId == empId[i]) {
                                found2 = true;
                                for (int j = i; j < count - 1; j++) {
                                    empId[j] = empId[j + 1];
                                    name[j] = name[j + 1];
                                    department[j] = department[j + 1];
                                    salary[j] = salary[j + 1];
                                }
                                count--;
                                System.out.println("Employee deleted successfully!");
                                break;
                            }
                        }
                        if (!found2) {
                            System.out.println("Employee not found.");
                        }
                        break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("Thank you!");
        sc.close();
    }
}