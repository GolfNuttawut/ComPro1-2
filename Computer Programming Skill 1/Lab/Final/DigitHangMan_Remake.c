#include <stdio.h>
int arr[1000][1000];
void main()
{
    int N[12],T[5];
    for(int i=0;i<12;i++)
    {
        scanf("%d",&N[i]);
    }

    for(int j=1;j<=5;j++)
    {
        scanf("%d",&T[j]);
    }
    for(int row=0;row<=5;row++)
    {
        for(int col=0;col<12;col++)
        {
            arr[row][col] = -1;
        }
    }
    int tab,count=0;
    for(int row=0;row<12;row++)
    {
        for(int col=1;col<=5;col++)
        {
            if(N[row]==T[col])
            {
                count++;
                for(int tab=col;tab<=5;tab++)
                {
                    arr[tab][row] = T[col];
                }
            }
        }
    }

    for(int row=0;row<=5;row++)
    {
        for(int col=0;col<12;col++)
        {
            if(arr[row][col]<0)
            {
                printf("_ ");
            }
            else
            {
                printf("%d ",arr[row][col]);
            }
        }
        printf("\n");
    }
    printf("%d",count);
}
