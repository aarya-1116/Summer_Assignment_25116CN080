#include <stdio.h>
int main(){
    int n,pro=1;
    printf("Enter the number to get the table:");
    scanf("%d",&n);
    for(int i=1;i<=10;i++){
        pro=n*i;
        printf("%d * %d = %d\n",n,i,pro);
    }
    return 0;
}