#include <stdio.h>
void main()
{
    int a;
    scanf("%d",&a);
    int x[a],i=0;
    for(i=0;i<a;i++)
    {
        scanf("%d",&x[i]);
    }
         i=a-1;
    for(int j=a;j>0;j--)
    {
        printf("%d ",x[i]);
        i--;
    }
}
