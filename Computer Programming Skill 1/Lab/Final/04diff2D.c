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
    int T;
    scanf("%d",&T);
    if(T==1)
    {
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C-1;j++)
            {
                printf("%d ",arr[i][j+1]-arr[i][j]);
            }
            printf("\n");
        }
    }
    if(T==2)
    {
        for(int i=0;i<R-1;i++)
        {
            for(int j=0;j<C;j++)
            {
                printf("%d ",arr[i+1][j]-arr[i][j]);
            }
            printf("\n");
        }
    }
}
