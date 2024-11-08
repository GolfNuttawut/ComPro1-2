#include <stdio.h>
void main()
{
    int x;
    scanf("%d",&x);
    int p=1,s=x/2;
    for(int i=0;i<x/2+1;i++)
    {
        for(int j=0;j<s;j++)
            printf(" ");
        for(int j=0;j<p;j++)
             printf("*");
         p = p+2;
         s--;
        printf("\n");
    }
    p=x-2 ,s = 1;
     for(int i=0;i<x/2;i++)
    {
        for(int j=0;j<s;j++)
            printf(" ");
        for(int j=0;j<p;j++)
             printf("*");
         p = p-2;
         s++;
        printf("\n");
    }
}
