#include <stdio.h>
void main()
{
    int coll,row;
    scanf("%d%d",&coll,&row);
    int Arr[101][101];
    for(int i=1;i<=coll;i++)
    {
        for(int j=1;j<=row;j++)
        {
            Arr[i][j]=0;
        }
    }
    int point,front,rear;
    scanf("%d",&point);
    for(int i=1;i<=point;i++)
    {
        scanf("%d%d",&front,&rear);
        Arr[front][rear]=i;
    }
     for(int i=1;i<=coll;i++)
    {
        for(int j=1;j<=row;j++)
        {
            printf("%d ",Arr[i][j]);
        }
        printf("\n");
    }
}
