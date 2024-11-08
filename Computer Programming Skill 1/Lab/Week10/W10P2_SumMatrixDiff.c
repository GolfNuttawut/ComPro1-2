#include <stdio.h>
void main()
{
    int R,sum=0,k=0,cou=0;
    scanf("%d",&R);
    int x[R][R];
    for(int i=0;i<R;i++)
    {
        for(int j=0;j<R;j++)
        {
            scanf("%d",&x[i][j]);
        }
    }
    for(int i=0;i<R-1;i++)
    {
        for(int j=1+k;j<R;j++)
        {
            sum =(x[i][j] - x[j][i]);
            if(sum<0)
            {
                sum = sum * -1;
            }
            cou = cou + sum;
        }

        k++;
    }
    printf("%d",cou);
}
