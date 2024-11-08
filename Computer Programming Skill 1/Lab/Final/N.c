#include <stdio.h>
int arr[250][250];
void main()
{
    int N,t=1,sl=1;
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            arr[i][j] = -1;
        }
    }
    for(int i=N-1;i>=0;i--)//F
    {
        for(int j=0;j<1;j++)
        {
            arr[i][j] = t%10;
        }
        t++;
    }

    for(int i=1;i<N-1;i++)//S
    {
        for(int j=sl;j<=sl;j++)
        {
            arr[i][j] = t%10;
        }
        sl++;
        t++;
    }
     for(int i=N-1;i>=0;i--)//B
    {
        for(int j=N-1;j<N;j++)
        {
            arr[i][j] = t%10;
        }
        t++;
    }
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            if(arr[i][j]<0)
            {
                printf("  ");
            }
            else
            {
                printf("%d ",arr[i][j]);
            }
        }
        printf("\n");
    }
}
