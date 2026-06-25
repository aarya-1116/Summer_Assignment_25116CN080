import java.util.Scanner;
public class maxFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int c,freq=1,index=arr[0];
        for(int i=0;i<n;i++){
            c=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                   c++;
                }
            }
            if(c>freq){ 
                freq=c;
                index=arr[i];
        }}
        System.out.println("Maximum frequecy:");
        System.out.println("Element="+index+" frequency="+freq);
        sc.close();
    }
}
