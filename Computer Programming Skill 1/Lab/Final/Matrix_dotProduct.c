#include <stdio.h>
void main()
{
    int R,C;
    scanf("%d%d",&R,&C);
    int arr[R][C];
    for(int i=0;i<R;i++)
    {
        for(int j=0;j<C;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    int t1,t2,sum=0;
    scanf("%d%d",&t1,&t2);
    for(int j=0;j<C;j++)
    {
        sum = sum + arr[t1-1][j]*arr[t2-1][j];
    }
    printf("%d",sum);
}
