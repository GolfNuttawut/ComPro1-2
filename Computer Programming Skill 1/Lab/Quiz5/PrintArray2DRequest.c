#include <stdio.h>
#include <limits.h>
void main()
{
    int N,R,C,MAX = INT_MIN,MIN = INT_MAX,count=0;
    scanf("%d",&N);
    int arr[N][N];
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    scanf("%d%d",&R,&C);
    for(int i=0;i<N;i=i+R)
    {
        for(int j=0;j<N;j=j+C)
        {
            printf("%d ",arr[i][j]);
            count++;
            if(arr[i][j]>MAX)
            {
                MAX = arr[i][j];
            }
            if(arr[i][j]<MIN)
            {
                MIN = arr[i][j];
            }
        }
        printf("\n");
    }
    printf("%d\n%d\n%d",count,MAX,MIN);
}
