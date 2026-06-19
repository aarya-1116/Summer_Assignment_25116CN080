public class invPyr {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*5-2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
