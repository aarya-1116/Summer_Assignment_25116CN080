import java.util.Scanner;
public class StudentRecordManagementSystem{
    static class Student{
        long rollNum;
        String name;
        int age; 
        String course;
        double cgpa;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] s=new Student[100];
        int count=0;
        System.out.println("-------Student Record Management System-------");
        System.out.println("1.Add Student\n2.Display Students\n3.Search Student\n4.Update Student\n5.Delete Student\n6.Exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        while(choice!=6){
            switch(choice){
                case 1:s[count]=new Student();
                System.out.println("Enter the roll number of the student:");
                s[count].rollNum=sc.nextLong();
                sc.nextLine();
                System.out.println("Enter the name of the student:");
                s[count].name=sc.nextLine();
                System.out.println("Enter the age of the student:");
                s[count].age=sc.nextInt();
                System.out.println("Enter the course of the student:");
                sc.nextLine();
                s[count].course=sc.nextLine();
                System.out.println("Enter the cgpa of the student:");
                s[count].cgpa=sc.nextDouble();
                count++;
                break;
                case 2:if(count==0){
                    System.out.println("No student record found.");
                }
                else{
                    for(int i=0;i<count;i++){
                        System.out.println("Student:"+(i+1));
                        System.out.println("Roll number:"+s[i].rollNum);
                        System.out.println("Name:"+s[i].name);
                        System.out.println("Age:"+s[i].age);
                        System.out.println("Course:"+s[i].course);
                        System.out.println("CGPA:"+s[i].cgpa);
                    }
                }
                break;
                case 3:System.out.println("Enter the roll number of the student:");
                long roll=sc.nextLong();int index1=-1;
                for(int i=0;i<count;i++){
                    if(roll==s[i].rollNum){
                        index1=i;
                        break;
                    }
                 }
                 if(index1==-1){
                    System.out.println("Student not found.");
                }
                else{
                     System.out.println("Roll number:"+s[index1].rollNum);
                        System.out.println("Name:"+s[index1].name);
                        System.out.println("Age:"+s[index1].age);
                        System.out.println("Course:"+s[index1].course);
                        System.out.println("CGPA:"+s[index1].cgpa);
                }
                 break;
                case 4:System.out.println("Enter the roll number of the student:");
                long roll1=sc.nextLong();
                 for(int i=0;i<count;i++){
                    if(roll1==s[i].rollNum){
                        System.out.println("-----Update Student-----");
                        System.out.println("1.Roll Number\n2.Name\n3.Age\n4.Course\n5.CGPA\n6.Exit\nEnter your choice:");
                        int update=sc.nextInt();
                        while(update!=6){ 
                        switch(update){
                            case 1:System.out.println("Enter the new roll number:");
                            long updateRoll=sc.nextLong();
                            s[i].rollNum=updateRoll;
                            break;
                            case 2:System.out.println("Enter the new name:");
                            sc.nextLine();
                            String updateName=sc.nextLine();
                            s[i].name=updateName;
                            break;
                            case 3:System.out.println("Enter the new age:");
                            int updateAge=sc.nextInt();
                            s[i].age=updateAge;
                            break;
                            case 4:System.out.println("Enter the new course:");
                            sc.nextLine();
                            String updateCourse=sc.nextLine();
                            s[i].course=updateCourse;
                            break;
                            case 5:System.out.println("Enter the new cgpa:");
                            double updateCgp=sc.nextDouble();
                            s[i].cgpa=updateCgp;
                            break;
                        }
                        System.out.println("1.Roll Number\n2.Name\n3.Age\n4.Course\n5.CGPA\n6.Exit\nEnter your choice:");
                        update=sc.nextInt();
                    }
                }
                }
                break;
                case 5:System.out.println("Enter the roll number:");
                long roll5=sc.nextLong();int index=-1;
                for(int i=0;i<count;i++){
                    if(roll5==s[i].rollNum){
                        index=i;
                        break;
                    }
                }
                if(index==-1){
                    System.out.println("Student not found.");
                }
                else{
                    for(int i=index;i<count-1;i++){
                        s[i]=s[i+1];
                    }
                    count--;
                    s[count]=null;
                    System.out.println("Student deleted successfully!");
                }
                break;
                default:System.out.println("Invalid Input!");
            }
            System.out.println("1.Add Student\n2.Display Students\n3.Search Student\n4.Update Student\n5.Delete Student\n6.Exit");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        }
        System.out.println("Thanks for using Student Record Management System");
        sc.close();
    }
}