#include <stdio.h>
int arr[1000][1000];
void main()
{
    int row,col;
    scanf("%d%d",&row,&col);
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    int point;
    scanf("%d",&point);
     for(int i=0;i<row;i++)
    {
        if(i%2==0)
        {
            for(int j=0;j<col;j++)
            {
                if(j%2!=0)
                {
                    printf("%d ",arr[i][j]+point);
                }
                else
                {
                    printf("%d ",arr[i][j]);
                }
            }
        }
        else
        {
            for(int j=0;j<col;j++)
            {
                  if(j%2==0)
                {
                    printf("%d ",arr[i][j]+point);
                }
                else
                {
                    printf("%d ",arr[i][j]);
                }
            }
        }
        printf("\n");
    }
}
