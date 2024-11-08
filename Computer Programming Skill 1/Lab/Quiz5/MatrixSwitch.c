#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int arr[201][201];
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    int P;
    scanf("%d",&P);
    if(P==1)
    {
         for(int i=0;i<N;i++)
        {
            for(int j=N/2;j<N;j++)
            {
                printf("%d ",arr[i][j]);
            }
            for(int k=0;k<N/2;k++)
            {
                printf("%d ",arr[i][k]);
            }
            printf("\n");
        }
    }
    else
    {
        for(int i=N/2;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                printf("%d ",arr[i][j]);
            }
            printf("\n");
        }
        for(int i=0;i<N/2;i++)
        {
            for(int j=0;j<N;j++)
            {
                printf("%d ",arr[i][j]);
            }
            printf("\n");
        }
    }
}
/*
#include <stdio.h>
int arr[250][250];
void main()
{
    int N,T;
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    scanf("%d",&T);
    if(T==1)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=N/2;j<N;j++)
            {
                printf("%d ",arr[i][j]);
            }
            for(int j=0;j<N/2;j++)
            {
                printf("%d ",arr[i][j]);
            }
            printf("\n");
        }
    }
    else if(T==2)
    {
        for(int i=N/2;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                printf("%d ",arr[i][j]);
            }
            printf("\n");
        }
        for(int i=0;i<N/2;i++)
        {
            for(int j=0;j<N;j++)
            {
                printf("%d ",arr[i][j]);
            }
            printf("\n");
        }
    }
}
*/
