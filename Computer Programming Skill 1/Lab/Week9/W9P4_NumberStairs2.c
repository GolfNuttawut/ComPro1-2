#include <stdio.h>
void main()
{
    int N=500;
    int x[N];
    int n,c=0;
    for(int i=0;1;i++)
    {
        scanf("%d",&n);
        if(n>=10 || n<=-10)
        {
           break;
        }
        else
        {
            x[i] = n;
            c++;
        }
    }
    int Spc = c - 1 , Num = 1,j=0;
    for(int i=0;i<c;i++)
    {
        for(int j=0;j<Spc;j++)
        {
            printf(" ");
        }
        for(int j=0;j<Num;j++)
        {
            printf("%d",x[i]);
        }
        Spc--;
        Num++;
        printf("\n");
    }
}
