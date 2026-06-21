public class dectobin{
public static void main(String[] args){
       int n=13;int bin=0,rev=0;
       while(n!=0){
       int d=n%2;
        bin=bin*10+d;
        n=n/2;
       }
       while(bin!=0){
         int d=bin%10;
         rev=rev*10+d;
         bin=bin/10;
       }
       System.out.println("13 in binary= "+rev);

}
} 