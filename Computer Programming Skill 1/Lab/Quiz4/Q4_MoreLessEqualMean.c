#include <stdio.h>
void main()
{
    int N,sum;
    scanf("%d",&N);
    int x[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&x[i]);
        sum = sum +x[i];
    }
    sum = sum/N;
    printf("%d\n",sum);
    int max=0,mid=0,min=0;
     for(int i=0;i<N;i++)
    {
        if(x[i]>sum)
        {
            max++;
        }
        else if(x[i]==sum)
        {
            mid++;
        }
        else if(x[i]<sum)
        {
            min++;
        }
    }
    printf("%d %d %d",max,min,mid);
}
