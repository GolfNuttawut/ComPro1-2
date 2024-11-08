#include <stdio.h>
void main()
{
    int R,C;
    scanf("%d%d",&R,&C);
    int x[R][C];
    for(int i=0;i<R;i++)
    {
        for(int j=0;j<C;j++)
        {
            scanf("%d",&x[i][j]);
        }
    }
    for(int j=0;j<C;j++)
    {
        for(int i=0;i<R;i++)
        {
            printf("%d ",x[i][j]);
        }
        printf("\n");
    }
}
