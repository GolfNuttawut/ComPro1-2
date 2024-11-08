#include <stdio.h>
void main()
{
    int N,K;
    scanf("%d",&N);
    if(N%2!=0)
    {
        K=N-1;
    }
    else
    {
        K=N;
    }
    int arr[N][N*2],T=N/2,cnt=0,L=0,R=K;
    for(int i=0;i<=N/2;i++)
    {
        for(int j=0;j<=K;j++)
        {
            if(j==L||j==R)
            {
                printf("%d",cnt);
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
        cnt++;
        L++;
        R--;
    }
    L=N/2;
    for(int i=N/2+1;i<=N;i++)
    {
        for(int j=0;j<=N;j++)
        {
            if(j==L)
            {
                printf("%d",cnt);
            }
            else
            {
                printf(" ");
            }
        }
        cnt++;
        printf("\n");
    }
}
