#include <stdio.h>
#include <limits.h>
int sum=0;
int countMax(int* arData, int N)
{
    int max = INT_MIN,count=0;
    for(int i=0;i<N;i++)
    {
        if(arData[i]>max)
        {
            max = arData[i];
        }
    }
    for(int i=0;i<N;i++)
    {
        if(arData[i]==max)
        {
            count++;
        }
    }
    return count;
}
void main()
{
    int N,sum;
    scanf("%d",&N);
    int arData[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arData[i]);
    }
    sum = countMax(arData,N);
    printf("%d",sum);
}
