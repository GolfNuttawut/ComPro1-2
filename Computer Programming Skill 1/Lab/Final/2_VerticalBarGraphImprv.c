#include <stdio.h>
#include <limits.h>
char TI[1000][1000];
void main()
{
    int N,MAX=INT_MIN;
    scanf("%d",&N);
    int arr[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);
        if(arr[i]>MAX)
        {
            MAX = arr[i];
        }
    }
    int T=MAX;
    for(int i=0;i<T;i++)//SET
    {
        for(int j=0;j<N;j++)
        {
            TI[i][j] = ' ';
        }
    }
    for(int i=0;i<T;i++)//STAR
    {
        for(int j=0;j<N;j++)
        {
            if(arr[j]>=MAX && MAX%10==0)
            {
                TI[i][j]='0';
            }
            else if(arr[j]>=MAX && MAX%5==0)
            {
                TI[i][j]='5';
            }
            else if(arr[j]>=MAX)
            {
                TI[i][j]='*';
            }
        }
        MAX--;
    }
    for(int i=0;i<T;i++)//PRINT
    {
        for(int j=0;j<N;j++)
        {
            printf("%c",TI[i][j]);
        }
        printf("\n");
    }
}
