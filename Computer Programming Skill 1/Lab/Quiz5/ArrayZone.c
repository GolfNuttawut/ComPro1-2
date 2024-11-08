#include <stdio.h>
void main()
{
    int row,coll;
    scanf("%d%d",&row,&coll);
    int arr[row][coll];
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<coll;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    int sum1=0;
    for(int i=0;i<row/2;i++)
    {
        for(int j=0;j<coll/2;j++)
        {
            sum1 = sum1 + arr[i][j];
        }
    }
        int sum2=0;
    for(int i=0;i<row/2;i++)
    {
        for(int j=coll/2;j<coll;j++)
        {
            sum2 = sum2 + arr[i][j];
        }
    }
        int sum3=0;
    for(int i=row/2;i<row;i++)
    {
        for(int j=0;j<coll/2;j++)
        {
            sum3 = sum3 + arr[i][j];
        }
    }
        int sum4=0;
    for(int i=row/2;i<row;i++)
    {
        for(int j=coll/2;j<coll;j++)
        {
            sum4 = sum4 + arr[i][j];
        }
    }
    printf("%d %d\n%d %d",sum1,sum2,sum3,sum4);
}
/*
#include <stdio.h>
int arr[1000][1000];
void main()
{
    int R,C,sum=0;
    scanf("%d%d",&R,&C);
    for(int i=0;i<R;i++)
    {
        for(int j=0;j<C;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    for(int i=0;i<R/2;i++)
    {
        for(int j=0;j<C/2;j++)
        {
            sum += arr[i][j];
        }
    }
    printf("%d ",sum);
    sum=0;
    for(int i=0;i<R/2;i++)
    {
        for(int j=C/2;j<C;j++)
        {
            sum += arr[i][j];
        }
    }
    printf("%d\n",sum);
    sum=0;
    for(int i=R/2;i<R;i++)
    {
        for(int j=0;j<C/2;j++)
        {
              sum += arr[i][j];
        }
    }
    printf("%d ",sum);
    sum = 0;
    for(int i=R/2;i<R;i++)
    {
        for(int j=C/2;j<C;j++)
        {
              sum += arr[i][j];
        }
    }
    printf("%d",sum);
}
*/
