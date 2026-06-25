public class charTri{
    public static void main(String[] args){
        char x;
        for(int i=1;i<=5;i++){
            x='A';
           for(int j=1;j<=i;j++){
            System.out.print(x);
            x++;
           }
           System.out.println();
        }
    }
}