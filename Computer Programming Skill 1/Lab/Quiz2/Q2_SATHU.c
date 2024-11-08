#include<stdio.h>
void main(){
    int x, divide=1, d=0;
    scanf("%d", &x);
    for(int i=0;i<10;i++)
    {
        if(x/divide%10 ==9)
        {
            d++;
            printf("SATHU ");
        }
        divide = divide*10;
    }
    if(d==9)
    {
        printf("\nOHH! Serious SATHU");
    }
    else if(d==0)
    {
        printf("Hope to find SATHU next time");
    }
}
