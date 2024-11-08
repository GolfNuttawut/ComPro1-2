#include <stdio.h>
int arr[1000001];
void main()
{
    int i,count=0,max=0;
    for(i=0;1;i++)
    {
        scanf("%d",&arr[i]);
        if(arr[i]>0)
        {
            count++;
        }
        else if(arr[i]==0)
        {
            break;
        }
    }
    printf("%d\n",count);
    int cnt,plus=0;
    for(i=0;i<count;i++)
    {
        cnt = 0;
        for(int j=0;j<count;j++)
        {
            if(arr[j]==arr[i])
            {
                cnt++;
            }
        }
        if(cnt>max)
        {
            max = cnt;
        }
    }
     for(i=0;i<count;i++)
    {
        cnt = 0;
        for(int j=plus;j<count;j++)
        {
            if(arr[j]==arr[i])
            {
                cnt++;
            }
        }
        if(cnt==max)
        {
            printf("%d ",arr[i]);
        }
        plus++;
    }
}
