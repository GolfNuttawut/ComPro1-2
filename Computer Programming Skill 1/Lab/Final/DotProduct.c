#include <stdio.h>
void main()
{
    int N,sum=0;
    scanf("%d",&N);
    int arr[2][N];
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<N;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    for(int i=0;i<N;i++)
    {
        sum += arr[0][i]*arr[1][i];
    }
    printf("%d",sum);
}
