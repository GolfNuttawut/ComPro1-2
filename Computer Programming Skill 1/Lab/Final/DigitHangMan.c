#include <stdio.h>
int arr[1000][1000];
void main()
{
    int N[12],T[5],count=0;
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
    int plus=11,cnt=0;
    for(int row=1;row<=5;row++)
    {
        cnt=0;
        for(int col=0;col<12;col++)
        {
            if(N[col]==T[row])
            {
                for(int table=row;table<=5;table++)
                {
                      arr[table][col] = T[row];
                }
                count++;
                cnt++;
            }
        }
        if(cnt==0)
        {
             plus++;
            for(int i=0;i<=5;i++)
            {
                if(i<row)
                {
                    arr[i][plus] = -2;
                }

                else
                {
                    arr[i][plus] = T[row];
                }
            }
        }
    }
    for(int row=0;row<=5;row++)
    {
        for(int col=0;col<=plus;col++)
        {
            if(arr[row][col]==-1)
            {
                printf("_ ");
            }
            else if(arr[row][col]==-2)
            {
                printf("  ");
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
