#include <stdio.h>
void main()
{
    int N,max=0,min=0;
    scanf("%d",&N);
    int x[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&x[i]);
    }
    int T;
    scanf("%d",&T);
    for(int i=0;i<N;i++)
    {
        if(x[i]>T)
        {
            max = max+x[i];
        }
    }
    for(int i=0;i<N;i++)
    {
         if(x[i]<T)
        {
            min = min+x[i];
        }
    }
    if(max>min)
    {
        printf("%d",max);
    }
    else
    {
        printf("%d",min);
    }
}
