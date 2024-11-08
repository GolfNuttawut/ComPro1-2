#include <stdio.h>
void main()
{
    int R,C,i=0;
    scanf("%d%d",&R,&C);
    while(i<R)
    {
        int j=0;
        while(j<C)
        {
            printf("*");
            j++;
        }
        printf("\n");
        i++;
    }
}
