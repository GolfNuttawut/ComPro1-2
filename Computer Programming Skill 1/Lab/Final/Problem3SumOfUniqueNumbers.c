#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int arr[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);
    }
    int cnt=0,sum=arr[0],count=1;
    for(int i=0;i<N;i++)
    {
        for(int j=i-1;j>=0;j--)
        {
            if(arr[i]!=arr[j])
            {
                cnt++;
            }
            else
            {
                cnt = 0;
                break;
            }
        }
        if(cnt>0)
        {
            sum += arr[i];
            count++;
            cnt = 0;
        }
    }
    printf("%d\n%d",count,sum);
}
