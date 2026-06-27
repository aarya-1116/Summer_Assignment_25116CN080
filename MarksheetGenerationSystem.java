import java.util.Scanner;
public class MarksheetGenerationSystem{
    static class Student{
        int roll_No;
        String name;
        int english;
        int maths;
        int science;
        int computer;
        int social;
        int total;
        double percentage;
        char grade;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] student=new Student[100];
        int count=0;
        System.out.println("----Marksheet Generation System----");
        System.out.println("1.Add Student\n2.Generate Marksheet\n3.Update marks\n4.Delete Student\n5.Exit\nEnter your choice:");
        int choice=sc.nextInt();
        while(choice!=5){
            switch(choice){
                case 1:student[count]=new Student();
                System.out.println("Enter the name of the student");
                sc.nextLine();
                student[count].name=sc.nextLine();
               System.out.println("Enter the roll number of the student");
                student[count].roll_No=sc.nextInt();
                System.out.println("Enter the marks of english of the student");
                student[count].english=sc.nextInt();
                 System.out.println("Enter the marks of maths of the student");
                student[count].maths=sc.nextInt();
                 System.out.println("Enter the marks of science of the student");
                student[count].science=sc.nextInt();
                 System.out.println("Enter the marks of computer of the student");
                student[count].computer=sc.nextInt();
                 System.out.println("Enter the marks of social of the student");
                student[count].social=sc.nextInt();
                student[count].total= student[count].english+student[count].maths+student[count].science+student[count].computer+student[count].social;
                student[count].percentage=student[count].total/5;
                if(student[count].percentage>=90.0){
                    student[count].grade='A';
                }
                else if(student[count].percentage>=80.0){
                    student[count].grade='B';
                }
                else if(student[count].percentage>=70.0){
                    student[count].grade='C';
                }
                else if(student[count].percentage>=60.0){
                    student[count].grade='D';
                }
                else if(student[count].percentage>=50.0){
                    student[count].grade='E';
                }
                else{
                    student[count].grade='F';
                }
                count++;
                break;
                case 2:
                for(int i=0;i<count;i++){
                    System.out.println("Name:"+student[i].name);
                    System.out.println("Roll Number:"+student[i].roll_No);
                    System.out.println("Marks of english:"+student[i].english);
                    System.out.println("Marks of maths:"+student[i].maths);
                     System.out.println("Marks of science:"+student[i].science);
                      System.out.println("Marks of computer:"+student[i].computer);
                     System.out.println("Marks of social:"+student[i].social);
                      System.out.println("Grand total out of 500:"+student[i].total);
                     System.out.println("Percentage:"+student[i].percentage);
                     System.out.println("Grade:"+student[i].grade);
                }
                break;
                case 3:System.out.println("Enter the roll number of the student:");
                int updateroll=sc.nextInt();int index=-1;
                for(int i=0;i<count;i++){
                    if(updateroll==student[i].roll_No){
                       index=i;
                       break;
                    }
                }
                if(index==-1){
                    System.out.println("No student found.");
                }
                else{
                    System.out.println("To update marks of the student select from following:\n1.English\n2.Maths\n3.Science\n4.Computer\n5.Social");
                    int upchoice=sc.nextInt();
                    switch(upchoice){
                        case 1:System.out.println("Enter new english marks");
                        student[index].english=sc.nextInt();
                        break;
                        case 2:System.out.println("Enter new maths marks");
                        student[index].maths=sc.nextInt();
                        break;
                        case 3:System.out.println("Enter new science marks");
                        student[index].science=sc.nextInt();
                        break;
                        case 4:System.out.println("Enter new computer marks");
                        student[index].computer=sc.nextInt();
                        break;
                        case 5:System.out.println("Enter new social marks");
                        student[index].social=sc.nextInt();
                        break;
                        default:System.out.println("Invalid input");
                        break;
                    }
                    System.out.println("Marks updated successfully!");
                }
                break;
                case 4:System.out.println("Enter the roll number of the student:");
                int deleteroll=sc.nextInt();int delindex=-1;
                for(int i=0;i<count;i++){
                    if(deleteroll==student[i].roll_No){
                       delindex=i;
                       break;
                    }
                }
                if(delindex==-1){
                    System.out.println("No student found.");
                }
                else{
                    for(int i=delindex;i<count-1;i++){
                        student[i]=student[i+1];
                    }
                    count--;
                    student[count]=null;
                    System.out.println("Student deleted successfully!");
                }
                break;
                default:System.out.println("Invalid input.");
                break;
            }
            System.out.println("1.Add Student\n2.Generate Marksheet\n3.Update marks\n4.Delete Student\n5.Exit\nEnter your choice:");
            choice=sc.nextInt();
        }
        System.out.println("Thanks for using marksheet generation system!");
        sc.close();
    }
}