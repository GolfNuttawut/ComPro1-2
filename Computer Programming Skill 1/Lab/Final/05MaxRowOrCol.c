#include <stdio.h>
#include <limits.h>
void main()
{
    int N,max = INT_MIN;
    scanf("%d",&N);
    int arr[N][N];
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<N;col++)
        {
            scanf("%d",&arr[row][col]);
        }
    }
    int sum,p,R=0,C=0;
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<N;col++)
        {
            sum += arr[row][col];
        }
        if(sum>max)
        {
            max = sum;
            p = 1;
            R = row+1;
        }
        sum = 0;
    }
    for(int col=0;col<N;col++)
    {
        for(int row=0;row<N;row++)
        {
            sum += arr[row][col];
        }
        if(sum>max)
        {
            max = sum;
            p = 2;
            C = col+1;
        }
        sum = 0;
    }
    if(p==1)
    {
        printf("max %d row %d",max,R);
    }
    else if(p==2)
    {
        printf("max %d col %d",max,C);
    }
}
