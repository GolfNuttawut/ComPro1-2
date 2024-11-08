#include <stdio.h>
#include <limits.h>
void main()
{
    int N,min=INT_MAX;
    scanf("%d",&N);
    int x[N];
    for(int i=0;i<N;i++)
    {
            scanf("%d",&x[i]);
    }
    int T,sum,P,count=0;
    scanf("%d",&T);
    for(int i=0;i<N;i++)
    {
            sum = T - x[i];
            if(sum<0)
            {
                sum = sum*-1;
            }
            if(sum<min)
            {
                min = sum;
            }
    }
    printf("%d\n",min);
     for(int i=0;i<N;i++)
    {
        if(T-x[i]==min || T-x[i]==min*-1)
        {
            count++;
        }
    }
    printf("%d\n",count);
}
