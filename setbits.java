public class setbits{
    public static void main(String[] args){
        int n=13;int bin=0;
    while(n>0){
        int d=n%2;
        bin=bin*10+d;
        n=n/2;
    }int c=0;
    while(bin!=0){
        int d=bin%10;
        if(d==1){
            c++;
        }
        bin=bin/10;
    }
    System.out.println(c);
    }
}