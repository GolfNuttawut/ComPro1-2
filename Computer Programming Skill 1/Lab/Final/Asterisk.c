#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int Mid = N/2,L=0,R=N-1;
    char arr[N][N];
    for(int i=0;i<N;i++)//SET SPACE
    {
        for(int j=0;j<N;j++)
        {
            arr[i][j] = ' ';
        }
    }
    for(int i=0;i<N;i++)//PERPENDICULAR
    {
        for(int j=0;j<N;j++)
        {
            if(i==Mid || j==Mid || j==L || j==R)
            {
                arr[i][j] = '*';
            }
        }
        L++;
        R--;
    }
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            printf("%c",arr[i][j]);
        }
        printf("\n");
    }
}
