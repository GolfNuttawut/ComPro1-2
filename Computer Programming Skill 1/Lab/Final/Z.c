#include <stdio.h>
int arr[2000][2000];
void main()
{
    int N,t=0;
    scanf("%d",&N);
    int sl=N-2;
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            arr[i][j] = -1;
        }
    }
    for(int i=0;i<1;i++)//F
    {
        for(int j=0;j<N;j++)
        {
            arr[i][j] = t%10;
            t++;
        }
    }

    for(int i=1;i<N;i++)//SL
    {
        for(int j=sl;j<=sl;j++)
        {
            arr[i][j] = t%10;
        }
        sl--;
        t++;
    }
     for(int i=N-1;i>=N-1;i--)//B
    {
        for(int j=1;j<N;j++)
        {
            arr[i][j] = t%10;
             t++;
        }
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
