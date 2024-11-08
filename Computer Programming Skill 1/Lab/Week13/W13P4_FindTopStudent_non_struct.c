#include <stdio.h>
#include <limits.h>
int arr[10000][10000];
void main()
{
    int N,K,sum,max=INT_MIN,sum_cnt,count;
    scanf("%d%d",&N,&K);
    for(int i=0;i<N;i++)
    {
        sum=0;
        count=0;
        for(int j=0;j<K;j++)
        {
            scanf("%d",&arr[i][j]);
            sum = sum + arr[i][j];
            if(arr[i][j]==9)
            {
                count++;
            }
        }
        if(sum>max)
        {
            max = sum;
            sum_cnt = count;
        }
    }
     printf("%d\n%d",max,sum_cnt);
}
