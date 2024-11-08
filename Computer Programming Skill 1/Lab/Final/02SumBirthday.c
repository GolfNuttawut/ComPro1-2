#include <stdio.h>
void main()
{
    int D,M,Y,sum=0;
    scanf("%d%d%d",&D,&M,&Y);
    sum = sum + D/10 + D%10 + M/10 + M%10 + Y/1000;
    sum = sum + ((Y-(1000*(Y/1000)))/100);
    Y = ((Y-(1000*(Y/1000)))%100);
    sum = sum + Y/10 + Y%10;
    printf("%d ",sum);
    int sum_1=0,sum_2=0;
    if(sum>=10)
    {
        sum_1 = sum_1 + sum/10 + sum%10;
        printf("%d ",sum_1);
        if(sum_1>=10)
        {
            sum_2 = sum_2 + sum_1/10 + sum_1%10;
            printf("%d",sum_2);
        }
    }
}
