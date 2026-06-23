import java.util.Scanner;
public class armSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of armstrong series :");
        int n=sc.nextInt();
        double d,arm;int c;
        int i,j,l;
        for(i=1;i<=n;i++){
            c=0;
            arm=0;
            j=l=i;
            while(l!=0){
                c++;
                l=l/10;
            }
            while(j!=0){
                d=j%10;
                arm=arm+Math.pow(d,c);
                j=j/10;
            }
            if(i==arm){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
