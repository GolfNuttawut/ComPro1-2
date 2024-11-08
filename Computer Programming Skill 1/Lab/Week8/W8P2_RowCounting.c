#include <stdio.h>
void main()
{
    int R,C,i=0,s=1;
    scanf("%d%d",&R,&C);
    while(i<R)
    {
        int j=0;
        while(j<C)
        {
             j++;
            printf("%d ",s);
            s++;
        }
        printf("\n");
        i++;
    }
}
