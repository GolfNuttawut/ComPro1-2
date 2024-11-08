#include <stdio.h>
char arr[100][100];
void main()
{
    int N;
    scanf("%d",&N);
    for(int i=1;i<=N;i++)//set space
    {
        for(int j=1;j<=N;j++)
        {
            arr[i][j] = ' ';
        }
    }
     for(int i=1;i<=N;i++)//square
    {
        for(int j=1;j<=N;j++)
        {
            if(i==1 || i==N)
            {
                 arr[i][j] = '*';
            }
            else
            {
                if(j==1 || j==N)
                {
                    arr[i][j] = '*';
                }
            }
        }
    }
     for(int i=N/2-1;i<=N/2+3;i++)//cos
    {
        for(int j=1;j<=N;j++)
        {
            arr[i][j] = '*';
        }
    }
     for(int i=1;i<=N;i++)//sin
    {
        for(int j=N/2-1;j<=N/2+3;j++)
        {
            arr[i][j] = '*';
        }
    }
    int F=1,R=3;
     for(int i=2;i<=N;i++)//Left
    {
        for(int j=1;j<=N;j++)
        {
            if(j>=F && j<=R)
            {
                arr[i][j] = '*';
            }
        }
        F++;
        R++;
    }
    F = N-2,R = N;
    for(int i=2;i<=N;i++)//Right
    {
        for(int j=1;j<=N;j++)
        {
            if(j>=F && j<=R)
            {
                arr[i][j] = '*';
            }
        }
        F--;
        R--;
    }
    for(int i=1;i<=N;i++)//print
    {
        for(int j=1;j<=N;j++)
        {
            printf("%c",arr[i][j]);
        }
        printf("\n");
    }
}
