#include <stdio.h>
char arr[1000][1000];
void main()
{
    int R,C;
    scanf("%d%d",&R,&C);
    for(int i=1;i<=R;i++)
    {
        for(int j=1;j<=C;j++)
        {
            arr[i][j] = '_';
        }
    }
    int N,A,B;
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
        scanf("%d%d",&A,&B);
        arr[A][B] = 'x';
    }
    for(int i=1;i<=R;i++)
    {
        for(int j=1;j<=C;j++)
        {
            printf("%c",arr[i][j]);
        }
        printf("\n");
    }
}
