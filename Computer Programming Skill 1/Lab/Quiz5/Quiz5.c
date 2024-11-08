#include <stdio.h>
void main()
{
    int N,x;
    scanf("%d",&N);
    int arr[N][10];
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<10;j++)
        {
            arr[i][j]=0;
        }
    }
     for(int i=0;i<N;i++)
    {
        for(int j=0;j<1;j++)
        {
           scanf("%d",&x);
           arr[i][x]=1;
        }
    }
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<10;j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}
