#include <stdio.h>
int arr[50000];
void main()
{
    int n,cnt=0,count=0,plus=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++)//INPUT
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++)//count
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
            cnt++;
        }
        count = 0;
    }
    printf("%d\n",cnt);
    for(int i=0;i<n;i++)
    {
         for(int j=i;j>=0;j--)
        {
            if(arr[i]==arr[j])
            {
                plus++;
            }
        }
        if(plus<=1)
        {
             for(int k=0;k<n;k++)
            {
                if(arr[i]==arr[k])
                {
                    count++;
                }
            }
            plus = 0;
        }
        if(count!=0)
        {
            printf("%d %d\n",arr[i],count);
            count = 0;
        }
    }
}
