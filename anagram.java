import java.util.Scanner;
public class anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings in lower case:");
        String str1=sc.next();
        String str2=sc.next();
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        for(int i=0;i<arr1.length-1;i++){
           for(int j=0;j<arr1.length-i-1;j++){
               if(arr1[j]>arr1[j+1]){
                char temp=arr1[j];
                arr1[j]=arr1[j+1];
                arr1[j+1]=temp;
               }
           }
        }
        for(int i=0;i<arr2.length-1;i++){
           for(int j=0;j<arr2.length-i-1;j++){
               if(arr2[j]>arr2[j+1]){
                char temp=arr2[j];
                arr2[j]=arr2[j+1];
                arr2[j+1]=temp;
               }
           }
        }
        String st1=new String(arr1);
        String st2=new String(arr2);
        if(st1.equals(st2))
            System.out.println("The given strings are anagrams.");
        else
             System.out.println("The given strings are not anagrams.");
            sc.close();
    }
}