#include <stdio.h>
int main(){
    int n,rev=0;
    printf("Enter the number to check if its palindrome:");
    scanf("%d",&n);
    int x=n;
    while(n!=0){
        int dig=n%10;
        rev=rev*10+dig;
        n=n/10;
    }
    if(rev==x){
        printf("%d is a palindrome number.",x);
    }
    else{
        printf("%d is not a palindrome number.",x);
    }
    return 0;
}