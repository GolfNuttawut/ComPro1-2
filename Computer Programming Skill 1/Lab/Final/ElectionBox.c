#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    char arr[N][N];
    for(int i=0;i<N;i++)//SET SPACE
    {
        for(int j=0;j<N;j++)
        {
            arr[i][j] = ' ';
        }
    }
    for(int i=0;i<N;i++)//SQARE
    {
        for(int j=0;j<N;j++)
        {
            if(i==0 || i==N-1 || j==0 || j==N-1)
            {
                arr[i][j] = '*';
            }
        }
    }
    int L=0,R=N-1;//BEGIN CROSS
    for(int i=0;i<N;i++)//CROSS
    {
        for(int j=0;j<N;j++)
        {
            if(j==L || j==R)
            {
                arr[i][j] = '*';
            }
        }
        L++;//MOVE TO Right
        R--;//MOVE TO LEFT
    }
    for(int i=0;i<N;i++)//PRINT
    {
        for(int j=0;j<N;j++)
        {
            printf("%c",arr[i][j]);
        }
        printf("\n");
    }
}
