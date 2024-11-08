#include <stdio.h>
void main()
{
    int N,T1=0,T2=0;
    scanf("%d",&N);
    int x[N][N];
    for(int i=0;i<2;i++)
    {

        for(int j=0;j<N;j++)
        {
            scanf("%d",&x[i][j]);
        }
    }
    for(int j=0;j<N;j++)
    {
            if(x[0][j]==x[1][j])
            {
                T1=T1+0;
                T2=T2+0;
            }
             else if(x[0][j]==1&&x[1][j]==2)
            {
                T2=T2+1;
            }
            else if(x[0][j]==1&&x[1][j]==3)
            {
                T1=T1+1;
            }
             else if(x[0][j]==2&&x[1][j]==1)
            {
                 T1=T1+1;
            }
             else if(x[0][j]==2&&x[1][j]==3)
            {
                T2=T2+1;
            }
             else if(x[0][j]==3&&x[1][j]==1)
            {
                T2=T2+1;
            }
             else if(x[0][j]==3&&x[1][j]==2)
            {
                 T1=T1+1;
            }
    }
    printf("%d %d\n",T1,T2);
    if(T1>T2)
    {
        printf("1");
    }
    else if(T1<T2)
    {
        printf("2");
    }
    else
    {
        printf("0");
    }
}


