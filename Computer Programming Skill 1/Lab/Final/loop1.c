#include <stdio.h>
void main()
{
    int exp,sum=1;
    scanf("%d",&exp);
    for(int i=0;i<exp;i++)
    {
        sum = sum * 10;
    }
    printf("%d",sum);
}
