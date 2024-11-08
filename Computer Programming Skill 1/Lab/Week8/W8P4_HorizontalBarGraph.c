#include <stdio.h>
void main()
{
    int x;
    while(1)
    {
        scanf("%d",&x);
        if(x<=0)
        {
            break;
        }
        else
        {
            int i=0;
            while(i<x)
            {
                printf("*");
                i++;
            }
        }
        printf("\n");
    }
}
