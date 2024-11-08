#include <stdio.h>
void main()
{
    int N,T=1;
    scanf("%d",&N);
    int arr[N][N*2];
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N*2;j++)
        {
           arr[i][j] = -1;
        }
    }
    for(int i=N-1;i>=0;i--)
    {
        for(int j=0;j<1;j++)
        {
           arr[i][j] = T%10;
        }
        T++;
    }
    int plus=2;
    for(int i=1;i<N;i++)
    {
        arr[i][plus] = T%10;
        plus += 2;
        T++;
    }
    for(int i=N-2;i>=0;i--)
    {
        arr[i][N*2-2] = T%10;
        T++;
    }
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N*2;j++)
        {
            if(arr[i][j]<0)
            {
                printf(" ");
            }
            else
            {
                printf("%d",arr[i][j]);
            }
        }
        printf("\n");
    }
}
