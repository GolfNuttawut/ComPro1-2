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
    int sum,R=0,C=0;
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<N;col++)
        {
            sum += arr[row][col];
        }
        if(sum>=max)
        {
            max = sum;
        }
        sum = 0;
    }
    for(int col=0;col<N;col++)
    {
        for(int row=0;row<N;row++)
        {
            sum += arr[row][col];
        }
        if(sum>=max)
        {
            max = sum;
        }
        sum = 0;
    }
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<N;col++)
        {
            sum += arr[row][col];
        }
        if(sum==max)
        {
            R++;
        }
        sum = 0;
    }
    for(int col=0;col<N;col++)
    {
        for(int row=0;row<N;row++)
        {
            sum += arr[row][col];
        }
        if(sum==max)
        {
            C++;
        }
        sum = 0;
    }
    printf("max %d",max);
    if(R>0)
    {
        printf("\nrow ");
        for(int row=0;row<N;row++)
        {
            for(int col=0;col<N;col++)
            {
                sum += arr[row][col];
            }
            if(sum==max)
            {
               printf("%d ",row+1);
            }
            sum=0;
        }
    }
    if(C>0)
    {
        printf("\ncol ");
        for(int col=0;col<N;col++)
        {
            for(int row=0;row<N;row++)
            {
                sum += arr[row][col];
            }
            if(sum==max)
            {
                printf("%d ",col+1);
            }
            sum = 0;
        }
    }
}
