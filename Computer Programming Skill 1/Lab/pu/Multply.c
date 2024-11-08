#include <stdio.h>
void main()
{
    int x,y,p,sum=0;
    scanf("%d%d%d",&x,&y,&p);
    if(x<y)
    {
        for(x;x<=y;x++)
        {
            printf("%d: ",x);
            for(int j=1;j<=p;j++)
            {
                sum = x*j;
                printf("%d ",sum);
            }
            printf("\n");
        }
    }
    else
    {
        for(y;y<=x;y++)
        {
            printf("%d: ",y);
            for(int j=1;j<=p;j++)
            {
                sum = y*j;
                printf("%d ",sum);
            }
            printf("\n");
        }
    }
}
