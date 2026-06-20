public class charPyr{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(char x='A';x<='A'+i;x++){
                System.out.print(x);
            }
            for(char x=(char)('A'+i-1);x>='A';x--){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}