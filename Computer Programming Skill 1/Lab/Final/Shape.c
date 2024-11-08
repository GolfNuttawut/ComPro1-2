#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    char arr[N][N];
    double sl1 = 1.0/3*N,sl2 = 2.0/3*N;//Find 1/3,2/3
    int s1=sl1 , s2=sl2;//double to int
    for(int i=0;i<N;i++)//SET_SPACE
    {
        for(int j=0;j<N;j++)
        {
            arr[i][j] = ' ';
        }
    }
     for(int i=0;i<N;i++)//SHARP
    {
        for(int j=0;j<N;j++)
        {
            if(j == s1 || j== s2)
            {
                arr[i][j] = '#';
            }
            if(i == s1 || i == s2)
            {
                arr[i][j] = '#';
            }
        }
    }
    for(int i=0;i<N;i++)//Print
    {
        for(int j=0;j<N;j++)
        {
            printf("%c",arr[i][j]);
        }
        printf("\n");
    }
}
