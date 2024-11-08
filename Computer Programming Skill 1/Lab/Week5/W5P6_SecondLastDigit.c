#include <stdio.h>
void main()
{
int x;
scanf("%d",&x);
x = x%100;
    if(x<10)
    {
        printf("0");
    }
    else
    {
        x=x/10;
        printf("%d",x);
    }
}
