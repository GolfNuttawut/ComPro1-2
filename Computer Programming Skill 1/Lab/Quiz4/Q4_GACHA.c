#include <stdio.h>
void main()
{
    int N,arr[100000],count=0;
    scanf("%d",&N);
    for(int i=0;1;i++)
    {
        scanf("%d",&arr[i]);
        if(arr[i]==0)
        {
            break;
        }
        count++;
    }
    float sum;
    for(int j=1;j<=N;j++)
    {
        sum=0;
        for(int k=0;k<count;k++)
        {
            if(arr[k]==j)
            {
                sum++;
            }
        }
        sum = sum/count*100;
        printf("%.2f%%\n",sum);
    }
}
