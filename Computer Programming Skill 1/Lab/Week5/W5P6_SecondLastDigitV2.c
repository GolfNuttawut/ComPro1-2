#include <stdio.h>
void main()
{
    int x,sum;
    scanf("%d",&x);
    sum = x%100;
    sum = sum/10;
    printf("%d",sum);
}
