#include <stdio.h>
void main()
{
    int N,X,Y,j=0;
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
        scanf("%d%d",&X,&Y);
        if(X<Y)
        {
           for(j=X;j<=Y;j++)
            {
                printf("%d ",j);
            }

        }
        else
        {
           for(j=Y;j<=X;j++)
            {
                printf("%d ",j);
            }

        }
        printf("\n");
    }
}
