#include <stdio.h>
#include <limits.h>
void main()
{
    int n,k,sum=0,max=INT_MIN;
    scanf("%d%d",&n,&k);
    int road[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&road[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(i>=k && i<=(n-1)-k)
        {
            sum = sum+road[i];
            for(int j=1;j<=k;j++)
            {
                sum=sum+road[i+j];
                sum=sum+road[i-j];
            }
        }
        if(sum>=max)
        {
            max=sum;
            sum=0;
        }
        else
        {
            sum=0;
        }
    }
    printf("%d",max);
}
