#include <stdio.h>
int main(){
    int n,d=0;
    printf("Enter the number");
    scanf("%d",&n);
    while(n>0){
    d++;
    n=n/10;
    }
    printf("The number of digits = %d",d);
    return 0;
}