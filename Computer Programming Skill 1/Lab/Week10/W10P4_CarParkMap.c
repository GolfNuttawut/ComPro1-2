#include <stdio.h>
void main()
{
    int M,N,K;
    scanf("%d%d%d",&M,&N,&K);
    int R,C;
    int x[R][C];
    for(int c=0;c<K;c++)
    {
        scanf("%d%d",&R,&C);
    }
    for(int i=0;i<M;i++)
    {
        for(int j=0;j<N;j++)
        {
            if(x[i+1][j+1]==x[R][C])
            {
                printf("x");
            }
            else
            {
                printf("_");
            }
              printf("  %d %d  ",R,C);
        }
        printf("\n");
    }
}
