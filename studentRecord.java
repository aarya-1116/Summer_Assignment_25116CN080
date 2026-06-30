import java.util.Scanner;
public class studentRecord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("----Student Record----");
        int[] rollNo=new int[100];
        String[] name=new String[100];
        String[] course=new String[100];
        double[] marks=new double[100];
        int count=0;
        while(true){
            System.out.println("\n1.Add student\n2.Display students\n3.Search students\n4.Update Student\n5.Delete student\n6.Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            if(choice==6)
                break;
            switch(choice){
                case 1:
                System.out.println("Enter the roll number of student:");
                rollNo[count]=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter name of student:");
                name[count]=sc.nextLine();
                System.out.println("Enter the course of student:");
                course[count]=sc.nextLine();
                System.out.println("Enter the cgpa of student:");
                marks[count]=sc.nextDouble();
                count++;
                    break;
                case 2:System.out.println("\nRoll no\tName\tCourse\tCGPA");
                    for(int i=0;i<count;i++){
                    System.out.println(rollNo[i]+"\t"+name[i]+"\t"+course[i]+"\t"+marks[i]);
                }
                    break;
                case 3:System.out.println("Enter the roll number:");
                int searchroll=sc.nextInt();boolean found=false;
                for(int i=0;i<count;i++){
                    if(searchroll==rollNo[i]){
                        found=true;
                     System.out.println("\nRoll no\tName\tCourse\tCGPA");  
                    System.out.println(rollNo[i]+"\t"+
                                          name[i]+"\t"+
                                          course[i]+"\t"+
                                          marks[i]);
                    break;
                    }
                }
                if(!found)
                    System.out.println("No student found.");
                    break;
                case 4:System.out.println("Enter the roll number:");
                int updateroll=sc.nextInt();boolean found1=false;
                for(int i=0;i<count;i++){
                    if(updateroll==rollNo[i]){
                        found1=true;
                        sc.nextLine();
                        System.out.println("Enter new name:");
                        name[i]=sc.nextLine();
                        System.out.println("Enter new course:");
                        course[i]=sc.nextLine();
                        System.out.println("Enter new cgpa:");
                        marks[i]=sc.nextDouble();
                        break;
                    }
                }
                if(!found1)
                    System.out.println("No student found.");
                    break;
                case 5:System.out.println("Enter the roll number:");
                int deleteroll=sc.nextInt();boolean found2=false;
                for(int i=0;i<count;i++){
                    if(deleteroll==rollNo[i]){
                        found2=true;
                        for(int j=i;j<count-1;j++){
                            rollNo[j]=rollNo[j+1];
                            name[j]=name[j+1];
                            marks[j]=marks[j+1];
                            course[j]=course[j+1];
                        }
                        count--;
                        System.out.println("Student deleted successfully!");
                        break;
                    }
                }
                if(!found2)
                    System.out.println("No student found.");
                    break;
                default:System.out.println("Invalid input.");
            }
        }
        System.out.println("Thank you!");
        sc.close();
    }
}