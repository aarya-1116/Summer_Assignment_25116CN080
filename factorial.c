#include <stdio.h>
int main(){
    int n,fact=1;
    printf("Enter the number to get factorial ");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    printf("factorial of %d = %d ",n,fact);
    return 0;
}