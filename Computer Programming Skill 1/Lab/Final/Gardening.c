#include <stdio.h>
#include <limits.h>
int arr[10000][10000];
void main()
{
    int R,C,sum=0,MAX=INT_MIN,MIN=INT_MAX,T_MAX,T_MIN,sum_all=0;
    scanf("%d%d",&R,&C);
    for(int i=0;i<C;i++)
    {
        for(int j=0;j<R;j++)
        {
            scanf("%d",&arr[i][j]);
            sum_all = sum_all + (arr[i][j]*40);
        }
    }
    printf("%d\n",sum_all);
    for(int i=0;i<R;i++)
    {
        for(int j=0;j<C;j++)
        {
            if(arr[j][i]>10)
            {
                arr[j][i]=10;
            }
            sum = sum + arr[j][i];
        }
        if(sum > MAX)
        {
            MAX = sum;
            T_MAX = i+1;
            sum = 0;
        }
        if(sum < MIN)
        {
            MIN = sum;
            T_MIN = i+1;
            sum = 0;
        }
    }
    printf("%d\n%d",T_MAX,T_MIN);
}
