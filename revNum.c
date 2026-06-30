#include <stdio.h>
int main(){
    int n,rev=0;
    printf("Enter a number to get the reverse of it:");
    scanf("%d",&n);
    int x=n;
    while(n!=0){
        int dig=n%10;
        rev=rev*10+dig;
        n=n/10;
    }
    printf("The reverse of %d is %d.",x,rev);
    return 0;
}