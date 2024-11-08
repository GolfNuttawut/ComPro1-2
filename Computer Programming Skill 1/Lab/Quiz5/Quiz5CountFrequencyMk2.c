#include <stdio.h>
int arr[50000],Num[50000];
void main()
{
    int N,count=0,cnt=0;
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
         scanf("%d",&arr[i]);
    }
     for(int i=0;i<N;i++)
    {
        for(int j=i;j>=0;j--)
        {
            if(arr[i]==arr[j])
            {
                count++;
            }
        }
        if(count<=1)
        {
            Num[i]=arr[i];
            cnt++;
        }
        count = 0;
    }
    printf("%d\n",cnt);
    for(int i=0;i<cnt;i++)
    {
        for(int j=0;j<N;j++)
        {
            if(Num[i]==arr[j])
            {
                count++;
            }
        }
        printf("%d %d\n",Num[i],count);
        count = 0;
    }
}
