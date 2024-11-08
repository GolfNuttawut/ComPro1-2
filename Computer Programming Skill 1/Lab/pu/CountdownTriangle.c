#include <stdio.h>
void main()
{
    int x,i=0;
    scanf("%d",&x);
    int spaec=0,num=x;
    for(i=0;i<x;i++)
    {
        int c = num%10;
        for(int j=0;j<spaec;j++)
        {
            printf(" ");
        }
        for(int j=0;j<num;j++)
        {
            printf("%d",c);
        }
        printf("\n");
        spaec++;
        num--;
    }
}
