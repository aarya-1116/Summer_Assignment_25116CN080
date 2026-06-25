#include <stdio.h>
int main(){
    int n,dig,sum=0;
    printf("Enter the number to get the sum of its digits:");
    scanf("%d",&n);
    int x=n;
    while(n!=0){
        dig=n%10;
        sum=sum+dig;
        n=n/10;
    }
    printf("The sum of digits of %d =%d ",x,sum);
    return 0;
}