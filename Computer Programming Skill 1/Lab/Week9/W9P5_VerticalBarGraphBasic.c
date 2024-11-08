#include <stdio.h>
//#include <limits.h>
void main()
{
    int N;
    int max = -1;//int max=INT_MIN;
    scanf("%d",&N);
    int x[N];
    for(int i = 0 ; i<N ; i++)
    {
        scanf("%d",&x[i]);
    }
    for(int i=0;i<N;i++)
    {
        if(x[i]>max)
        {
            max = x[i];
        }
    }
    int col = max;
    for(int i=0;i<max;i++)
    {
         for(int j=0;j<N;j++)
         {
             if(x[j]>=col)
               {
                 printf("*");
               }
             else
               {
                 printf(" ");
               }
         }
         col--;
         printf("\n");
    }
}
