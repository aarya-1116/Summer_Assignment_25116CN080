#include <stdio.h>
int main(){
     int n,sum=0;
    printf("Enter the number till which sum is to be calculated");
    scanf("%d",&n);
    for(int i=0;i<=n;i++){
        sum=sum+i;
    }
    printf("The sum of %d natural numbers is: %d",n,sum);
    return 0;
}