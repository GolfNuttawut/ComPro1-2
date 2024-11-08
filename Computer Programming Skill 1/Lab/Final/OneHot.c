#include <stdio.h>
#include <limits.h>
void main()
{
    int N,MAX=INT_MIN;
    scanf("%d",&N);
    int row[N][N],tab=0;
    for(int i=0;i<N;i++)
    {
        scanf("%d",&row[i][0]);
        if(row[i][0]>MAX)
        {
            MAX = row[i][0];
        }
    }
    int arr[N][MAX+1];
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<=MAX;j++)
        {
            if(j == row[i][0])
            {
                arr[i][j] = 1;
            }
            else
            {
                arr[i][j] = 0;
            }
        }
    }
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<=MAX;j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}
