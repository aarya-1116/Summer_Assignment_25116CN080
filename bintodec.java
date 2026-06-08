public class bintodec{
    public static void main(String[] args){
        int n=1101;int res=0,i=0;
        while(n>0){
            int d=n%10;
            res=res+d*(int)Math.pow(2,i);
            n=n/10;
            i++;
        }
        System.out.println("Decimal number for 1101 = "+res);
    }
}