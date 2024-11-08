#include <stdio.h>
void main()
{
    int row,col;
    scanf("%d%d",&row,&col);
    int arr[101][101];
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=col;j++)
        {
            arr[i][j]=0;
        }
    }
    int point,D,R;
    scanf("%d",&point);
    for(int i=1;i<=point;i++)
    {
        scanf("%d%d",&D,&R);
        arr[D][R]=i;
    }
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=col;j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}
