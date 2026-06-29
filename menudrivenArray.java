import java.util.Scanner;
import java.util.Arrays;
public class menudrivenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        int count=0;
        System.out.println("-----Array Operations-----");
        while(true){
        System.out.println("\n1.Add Element\n2.Display Array\n3.Search Element\n4.Update Element\n5.Delete Element\n6.Find maximum\n7.Find minimum\n8.Calculate sum\n9.Calculate average\n10.Sort array\n11.Exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
            switch(choice){
                case 1:System.out.println("Enter element:");
                arr[count]=sc.nextInt();
                count++;
                System.out.println("Element added succcessfully!");
                break;
                case 2:for(int i=0;i<count;i++){
                    System.out.print(arr[i]+" ");
                }
                break;
                case 3:System.out.println("Enter the element to search:");
                int search = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                     if (arr[i] == search) {
                        System.out.println("Element found at index " + i);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                 System.out.println("Element not found");
                }
                break;
                case 4:if(count == 0){
                        System.out.println("Array is empty.");
                        break;
                    }
                    System.out.println("Enter the index of the element to be updated:");
                int updateind=sc.nextInt();
                System.out.println("Enter the new element:");
                int update=sc.nextInt();
                arr[updateind]=update;
                break;
                case 5:if(count == 0){
                        System.out.println("Array is empty.");
                        break;
                    }
                    System.out.println("Enter the index of the element to be updated:");
                int deleteind=sc.nextInt();
                for(int i=deleteind;i<count-1;i++){
                    arr[i]=arr[i+1];
                }
                count--;
                arr[count]=0;
                break;
                case 6:if(count == 0){
                        System.out.println("Array is empty.");
                        break;
                    }
                    int maximum=arr[0];
                for(int i=1;i<count;i++){
                    if(arr[i]>maximum){
                        maximum=arr[i];
                    }
                }
                System.out.println("Maximum element:"+maximum);
                break;
                case 7:if(count == 0){
                        System.out.println("Array is empty.");
                        break;
                    }
                    int min=arr[0];
                for(int i=1;i<count;i++){
                    if(arr[i]<min){
                        min=arr[i];
                    }
                }
                System.out.println("Minimum element:"+min);
                break;
                case 8:if(count == 0){
                        System.out.println("Array is empty.");
                        break;
                    }
                    int sum=0;
                for(int i=0;i<count;i++){
                    sum=sum+arr[i];
                }
                System.out.println("Sum of all elements:"+sum);
                break;
                case 9:if(count == 0){
                        System.out.println("Array is empty.");
                        break;
                    }
                    int sum1=0;
                for(int i=0;i<count;i++){
                    sum1=sum1+arr[i];
                }
                    System.out.println("Average:"+(sum1/count));
                break;
                case 10:if(count == 0){
                        System.out.println("Array is empty.");
                        break;
                    }
                    Arrays.sort(arr,0,count);
                System.out.println("Sorted array:");
                for(int i=0;i<count;i++){
                    System.out.print(arr[i]+" ");
                }
                break;
                case 11:System.out.println("Thank you for using menu driven array operating sysytem!");
                sc.close();
                return;
                default:System.out.println("Invalid input.");
                break;
            }
        }
    }
}
