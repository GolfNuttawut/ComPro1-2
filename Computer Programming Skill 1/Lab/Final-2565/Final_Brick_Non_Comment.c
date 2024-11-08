#include <stdio.h>
void main()
{
    int N,M;
    scanf("%d%d",&N,&M);
    char table[N][M];
    int Brick[M];
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<M;col++)
        {
            scanf("\n%c",&table[row][col]);
        }
    }
    for(int i=0;i<M;i++)
    {
        scanf("%d",&Brick[i]);
    }
    for(int i=0;i<M;i++)
    {
        for(int j=0;j<Brick[i];j++)
        {
            for(int row=0;row<N;row++)
            {
                if(table[row][i]!='.')
                {
                    table[row-1][i]='#';
                    break;
                }
                if(row==N-1)
                {
                    table[N-1][i]='#';
                }
            }
        }
    }
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<M;col++)
        {
            printf("%c",table[row][col]);
        }
        printf("\n");
    }
}
