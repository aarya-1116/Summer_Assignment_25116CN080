#include <stdio.h>
int main(){
    int n,pro=1;
    printf("Enter the number to get the product of its digits:");
    scanf("%d",&n);
    int x=n;
    while(n!=0){
        int dig=n%10;
        pro=pro*dig;
        n=n/10;
    }
    printf("The product of the digits of %d is %d.",x,pro);
    return 0;
}